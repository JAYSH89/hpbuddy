package nl.jaysh.hpbuddy.feature.food

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import nl.jaysh.hpbuddy.R
import nl.jaysh.hpbuddy.core.designsystem.HpbuddyTheme

@Composable
fun FoodScreen(viewModel: FoodViewModel = hiltViewModel()) {
    val state by viewModel.state.collectAsStateWithLifecycle()

    FoodScreenContent(state = state, onEvent = viewModel::onEvent)
}

@Composable
private fun FoodScreenContent(state: FoodViewModelState, onEvent: (FoodViewModelEvent) -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        TitleRow()

        TextField(
            modifier = Modifier.fillMaxWidth(),
            placeholder = { Text(text = "Search") },
            value = "",
            onValueChange = {},
        )
    }
}

@Composable
fun TitleRow(modifier: Modifier = Modifier) = Row(
    modifier = Modifier.fillMaxWidth(),
    horizontalArrangement = Arrangement.SpaceBetween,
) {
    Text(text = "Food", style = MaterialTheme.typography.displayLarge)

    IconButton(onClick = {}) {
        Icon(
            modifier = Modifier.size(80.dp),
            painter = painterResource(R.drawable.add),
            contentDescription = null,
        )
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
