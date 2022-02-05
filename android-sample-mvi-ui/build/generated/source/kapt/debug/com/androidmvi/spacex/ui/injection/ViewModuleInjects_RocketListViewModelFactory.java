// Generated by Dagger (https://dagger.dev).
package com.androidmvi.spacex.ui.injection;

import androidx.lifecycle.ViewModel;
import com.androidmvi.spacex.network.repository.RocketsListRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ViewModuleInjects_RocketListViewModelFactory implements Factory<ViewModel> {
  private final Provider<RocketsListRepository> repositoryProvider;

  public ViewModuleInjects_RocketListViewModelFactory(
      Provider<RocketsListRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public ViewModel get() {
    return rocketListViewModel(repositoryProvider.get());
  }

  public static ViewModuleInjects_RocketListViewModelFactory create(
      Provider<RocketsListRepository> repositoryProvider) {
    return new ViewModuleInjects_RocketListViewModelFactory(repositoryProvider);
  }

  public static ViewModel rocketListViewModel(RocketsListRepository repository) {
    return Preconditions.checkNotNullFromProvides(ViewModuleInjects.INSTANCE.rocketListViewModel(repository));
  }
}
