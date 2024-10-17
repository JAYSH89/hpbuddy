package nl.jaysh.hpbuddy.feature.food

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class FoodViewModel
    @Inject
    constructor() : ViewModel() {
        private val _state = MutableStateFlow(FoodViewModelState())
        val state: StateFlow<FoodViewModelState> = _state

        fun onEvent(event: FoodViewModelEvent) {
            when (event) {
                FoodViewModelEvent.SampleEvent -> {}
            }
        }
    }

sealed interface FoodViewModelEvent {
    data object SampleEvent : FoodViewModelEvent
}

data class FoodViewModelState(val isLoading: Boolean = false)
