package nl.jaysh.hpbuddy.core.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import nl.jaysh.hpbuddy.feature.dashboard.DashboardScreen
import nl.jaysh.hpbuddy.feature.food.FoodScreen
import nl.jaysh.hpbuddy.feature.journal.JournalScreen
import nl.jaysh.hpbuddy.feature.settings.SettingsScreen

@Composable
fun HomeNavHost(
    rootNavController: NavController,
    homeNavController: NavHostController,
) {
    NavHost(navController = homeNavController, startDestination = Destination.DASHBOARD) {
        composable(Destination.DASHBOARD) {
            DashboardScreen()
        }

        composable(Destination.JOURNAL) {
            JournalScreen()
        }

        composable(Destination.FOOD) {
            FoodScreen()
        }

        composable(Destination.SETTINGS) {
            SettingsScreen()
        }
    }
}
