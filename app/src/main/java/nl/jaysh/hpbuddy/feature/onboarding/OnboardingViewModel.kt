package nl.jaysh.hpbuddy.feature.onboarding

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class OnboardingViewModel
    @Inject
    constructor() : ViewModel() {
        private val _state = MutableStateFlow(OnboardingViewModelState())
        val state: StateFlow<OnboardingViewModelState> = _state

        fun onEvent(event: OnboardingViewModelEvent) {
            when (event) {
                OnboardingViewModelEvent.SampleEvent -> {}
            }
        }
    }

sealed interface OnboardingViewModelEvent {
    data object SampleEvent : OnboardingViewModelEvent
}

data class OnboardingViewModelState(val isLoading: Boolean = false)
