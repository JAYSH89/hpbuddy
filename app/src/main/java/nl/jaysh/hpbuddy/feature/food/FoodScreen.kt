package nl.jaysh.hpbuddy.feature.food

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import nl.jaysh.hpbuddy.core.designsystem.HpbuddyTheme

@Composable
fun FoodScreen(viewModel: FoodViewModel = hiltViewModel()) {
    val state by viewModel.state.collectAsStateWithLifecycle()

    FoodScreenContent(state = state, onEvent = viewModel::onEvent)
}

@Composable
private fun FoodScreenContent(
    state: FoodViewModelState,
    onEvent: (FoodViewModelEvent) -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
    ) {
        Text(text = "Food", style = MaterialTheme.typography.displayLarge)
    }
}

// PREVIEWS

@Preview
@Composable
private fun FoodScreenPreview() {
    HpbuddyTheme {
        FoodScreenContent(state = FoodViewModelState(), onEvent = {})
    }
}
