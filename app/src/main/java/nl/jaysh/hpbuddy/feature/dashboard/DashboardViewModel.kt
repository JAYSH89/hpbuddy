package nl.jaysh.hpbuddy.feature.dashboard

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

@HiltViewModel
class DashboardViewModel @Inject constructor() : ViewModel() {

  private val _state = MutableStateFlow(DashboardViewModelState())
  val state: StateFlow<DashboardViewModelState> = _state

  fun onEvent(event: DashboardViewModelEvent) {
    when (event) {
      DashboardViewModelEvent.SampleEvent -> {}
    }
  }
}

sealed interface DashboardViewModelEvent {
  data object SampleEvent : DashboardViewModelEvent
}

data class DashboardViewModelState(val isLoading: Boolean = false)
