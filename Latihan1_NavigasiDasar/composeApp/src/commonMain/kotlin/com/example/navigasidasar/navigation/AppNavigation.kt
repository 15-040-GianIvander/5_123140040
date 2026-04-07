package navigation

import androidx.compose.runtime.*
import com.example.navigasidasar.screens.DetailScreen
import com.example.navigasidasar.screens.HomeScreen

@Composable
fun AppNavigation() {

    var currentScreen by remember { mutableStateOf("home") }

    when (currentScreen) {

        "home" -> HomeScreen(
            onNavigateToDetail = {
                currentScreen = "detail"
            }
        )

        "detail" -> DetailScreen(
            onBack = {
                currentScreen = "home"
            }
        )
    }
}