package nl.jaysh.hpbuddy.feature.activity

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import nl.jaysh.hpbuddy.core.designsystem.HpbuddyTheme

@Preview
@Composable
private fun ActivityScreenPreview() = HpbuddyTheme {
  ActivityScreenContent(state = ActivityViewModelState(), onEvent = {})
}

@Composable
fun ActivityScreen(viewModel: ActivityViewModel = hiltViewModel()) {
  val state by viewModel.state.collectAsStateWithLifecycle()

  ActivityScreenContent(state = state, onEvent = viewModel::onEvent)
}

@Composable
private fun ActivityScreenContent(
  state: ActivityViewModelState,
  onEvent: (ActivityViewModelEvent) -> Unit,
) {
  Column(
    modifier = Modifier.fillMaxSize(),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center,
    content = { Text(text = "Activity") },
  )
}
