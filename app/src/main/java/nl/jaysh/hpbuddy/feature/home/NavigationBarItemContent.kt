package nl.jaysh.hpbuddy.feature.home

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import nl.jaysh.hpbuddy.R
import nl.jaysh.hpbuddy.core.ui.navigation.Destination

sealed class NavigationBarItemContent(
    val route: String,
    @StringRes val title: Int,
    @DrawableRes val selectedIcon: Int,
    @DrawableRes val unselectedIcon: Int,
) {
    data object Dashboard : NavigationBarItemContent(
        route = Destination.DASHBOARD,
        title = R.string.bottom_bar_dashboard,
        selectedIcon = R.drawable.calendar,
        unselectedIcon = R.drawable.outline_calendar,
    )

    data object Journal : NavigationBarItemContent(
        route = Destination.JOURNAL,
        title = R.string.bottom_bar_journal,
        selectedIcon = R.drawable.bookmark,
        unselectedIcon = R.drawable.outline_bookmark,
    )

    data object Food : NavigationBarItemContent(
        route = Destination.FOOD,
        title = R.string.bottom_bar_food,
        selectedIcon = R.drawable.food,
        unselectedIcon = R.drawable.outline_food,
    )

    data object Settings : NavigationBarItemContent(
        route = Destination.SETTINGS,
        title = R.string.bottom_bar_settings,
        selectedIcon = R.drawable.settings,
        unselectedIcon = R.drawable.outline_settings,
    )
}
