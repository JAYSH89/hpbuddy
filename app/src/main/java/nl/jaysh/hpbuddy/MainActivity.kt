package nl.jaysh.hpbuddy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import nl.jaysh.hpbuddy.core.designsystem.HpbuddyTheme
import nl.jaysh.hpbuddy.core.ui.navigation.RootNavHost

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            HpbuddyTheme {
                val navController = rememberNavController()
                RootNavHost(navController)
            }
        }
    }
}
