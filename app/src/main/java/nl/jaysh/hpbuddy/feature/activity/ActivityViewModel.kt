package nl.jaysh.hpbuddy.feature.activity

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

@HiltViewModel
class ActivityViewModel @Inject constructor() : ViewModel() {

  private val _state = MutableStateFlow(ActivityViewModelState())
  val state: StateFlow<ActivityViewModelState> = _state

  fun onEvent(event: ActivityViewModelEvent) {
    when (event) {
      ActivityViewModelEvent.SampleEvent -> {}
    }
  }
}

sealed interface ActivityViewModelEvent {
  data object SampleEvent : ActivityViewModelEvent
}

data class ActivityViewModelState(val isLoading: Boolean = false)
