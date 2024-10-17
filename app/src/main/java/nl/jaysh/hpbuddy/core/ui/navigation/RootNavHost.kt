package nl.jaysh.hpbuddy.core.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import nl.jaysh.hpbuddy.feature.home.HomeScreen
import nl.jaysh.hpbuddy.feature.onboarding.OnboardingScreen

@Composable
fun RootNavHost(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Destination.HOME) {
        composable(Destination.HOME) {
            HomeScreen(rootNavController = navController)
        }

        composable(Destination.ONBOARDING) {
            OnboardingScreen()
        }
    }
}
