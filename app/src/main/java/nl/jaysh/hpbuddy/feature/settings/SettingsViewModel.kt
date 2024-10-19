package nl.jaysh.hpbuddy.feature.settings

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class SettingsViewModel
@Inject
constructor() : ViewModel() {
    private val _state = MutableStateFlow(SettingsViewModelState())
    val state: StateFlow<SettingsViewModelState> = _state

    fun onEvent(event: SettingsViewModelEvent) {
        when (event) {
            SettingsViewModelEvent.SampleEvent -> {}
        }
    }
}

sealed interface SettingsViewModelEvent {
    data object SampleEvent : SettingsViewModelEvent
}

data class SettingsViewModelState(val isLoading: Boolean = false)
