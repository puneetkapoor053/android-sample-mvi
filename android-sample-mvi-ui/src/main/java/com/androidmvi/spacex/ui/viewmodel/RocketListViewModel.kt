package com.androidmvi.spacex.ui.viewmodel

import com.androidmvi.spacex.network.repository.RocketsListRepository
import javax.inject.Inject

class RocketListViewModel @Inject constructor(
    private val repository: RocketsListRepository
) : BaseViewModel() {

    private val _viewState: StateLiveData<MainViewState> = StateLiveData()

    val viewState: StateLiveData<MainViewState>
        get() = _viewState

    fun handleStateEvent(stateEvent: MainStateEvent) {
        when (stateEvent) {
            is MainStateEvent.GetRockets -> {
                getRocketList()
            }

            is MainStateEvent.FilterData -> {
                filterBasedOnStatus(stateEvent.status)
            }
            else -> {
                //
            }
        }
    }

    fun getRocketList() {
        _viewState.postLoading()
        addDisposable(
            repository.fetchRocketList()
                .subscribe({

                    repository.setListOfRockets(it)
                    _viewState.postSuccess(MainViewState(it))

                }, {
                    _viewState.postError(it)

                })
        )
    }

    fun filterBasedOnStatus(status: String) {
        when (status) {
            Status.Active.toString() -> {
                _viewState.postSuccess(MainViewState(repository.getListOfRockets.filter {
                    it.active
                }))
            }
            Status.InActive.toString() -> {
                _viewState.postSuccess(MainViewState(repository.getListOfRockets.filter {
                    !it.active
                }))
            }
            else -> {
                _viewState.postSuccess(MainViewState(repository.getListOfRockets))
            }
        }
    }

    enum class Status {
        Active, InActive
    }
}