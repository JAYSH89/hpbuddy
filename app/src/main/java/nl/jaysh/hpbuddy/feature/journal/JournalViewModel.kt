package nl.jaysh.hpbuddy.feature.journal

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

@HiltViewModel
class JournalViewModel @Inject constructor() : ViewModel() {

  private val _state = MutableStateFlow(JournalViewModelState())
  val state: StateFlow<JournalViewModelState> = _state

  fun onEvent(event: JournalViewModelEvent) {
    when (event) {
      JournalViewModelEvent.SampleEvent -> {}
    }
  }
}

sealed interface JournalViewModelEvent {
  data object SampleEvent : JournalViewModelEvent
}

data class JournalViewModelState(val isLoading: Boolean = false)
