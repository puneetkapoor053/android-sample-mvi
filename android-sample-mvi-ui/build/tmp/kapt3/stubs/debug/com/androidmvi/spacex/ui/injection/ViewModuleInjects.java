package com.androidmvi.spacex.ui.injection;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007\u00a8\u0006\n"}, d2 = {"Lcom/androidmvi/spacex/ui/injection/ViewModuleInjects;", "", "()V", "rocketDetailsViewModel", "Landroidx/lifecycle/ViewModel;", "rocketListUseCase", "Lcom/androidmvi/spacex/network/usecase/RocketDetailsUseCase;", "rocketListViewModel", "repository", "Lcom/androidmvi/spacex/network/repository/RocketsListRepository;", "android-sample-mvi-ui_debug"})
@dagger.Module()
public final class ViewModuleInjects {
    @org.jetbrains.annotations.NotNull()
    public static final com.androidmvi.spacex.ui.injection.ViewModuleInjects INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = com.androidmvi.spacex.ui.viewmodel.RocketListViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Provides()
    public final androidx.lifecycle.ViewModel rocketListViewModel(@org.jetbrains.annotations.NotNull()
    com.androidmvi.spacex.network.repository.RocketsListRepository repository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = com.androidmvi.spacex.ui.viewmodel.RocketDetailsViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Provides()
    public final androidx.lifecycle.ViewModel rocketDetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.androidmvi.spacex.network.usecase.RocketDetailsUseCase rocketListUseCase) {
        return null;
    }
    
    private ViewModuleInjects() {
        super();
    }
}