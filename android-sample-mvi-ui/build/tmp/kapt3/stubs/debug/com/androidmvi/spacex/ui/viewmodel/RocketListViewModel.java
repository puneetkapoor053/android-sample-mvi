package com.androidmvi.spacex.ui.viewmodel;

import java.lang.System;

@kotlin.Suppress(names = {"UNCHECKED_CAST"})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\rJ\u000e\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0015"}, d2 = {"Lcom/androidmvi/spacex/ui/viewmodel/RocketListViewModel;", "Lcom/androidmvi/spacex/ui/viewmodel/BaseViewModel;", "repository", "Lcom/androidmvi/spacex/network/repository/RocketsListRepository;", "(Lcom/androidmvi/spacex/network/repository/RocketsListRepository;)V", "_state", "Lcom/androidmvi/spacex/ui/viewmodel/StateLiveData;", "Lcom/androidmvi/spacex/ui/viewmodel/MainViewState;", "state", "Landroidx/lifecycle/LiveData;", "getState", "()Landroidx/lifecycle/LiveData;", "filterBasedOnStatus", "", "status", "", "getRocketList", "handleStateEvent", "stateEvent", "Lcom/androidmvi/spacex/ui/viewmodel/MainStateEvent;", "Status", "android-sample-mvi-ui_debug"})
public final class RocketListViewModel extends com.androidmvi.spacex.ui.viewmodel.BaseViewModel {
    private final com.androidmvi.spacex.ui.viewmodel.StateLiveData<com.androidmvi.spacex.ui.viewmodel.MainViewState> _state = null;
    private final com.androidmvi.spacex.network.repository.RocketsListRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.androidmvi.spacex.ui.viewmodel.MainViewState> getState() {
        return null;
    }
    
    public final void handleStateEvent(@org.jetbrains.annotations.NotNull()
    com.androidmvi.spacex.ui.viewmodel.MainStateEvent stateEvent) {
    }
    
    public final void getRocketList() {
    }
    
    public final void filterBasedOnStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String status) {
    }
    
    @javax.inject.Inject()
    public RocketListViewModel(@org.jetbrains.annotations.NotNull()
    com.androidmvi.spacex.network.repository.RocketsListRepository repository) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/androidmvi/spacex/ui/viewmodel/RocketListViewModel$Status;", "", "(Ljava/lang/String;I)V", "Active", "InActive", "android-sample-mvi-ui_debug"})
    public static enum Status {
        /*public static final*/ Active /* = new Active() */,
        /*public static final*/ InActive /* = new InActive() */;
        
        Status() {
        }
    }
}