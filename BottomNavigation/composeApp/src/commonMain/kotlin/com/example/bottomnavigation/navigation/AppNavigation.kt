package com.example.bottomnavigation.navigation // Pastikan sesuai struktur folder

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
// Import manual ke folder lain:
import com.example.bottomnavigation.components.BottomBar
import com.example.bottomnavigation.screens.HomeScreen
import com.example.bottomnavigation.screens.FavoritesScreen
import com.example.bottomnavigation.screens.ProfileScreen

sealed class Screen(val route: String, val label: String) {
    object Home : Screen("home", "Home")
    object Favorites : Screen("favorites", "Favorites")
    object Profile : Screen("profile", "Profile")
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomBar(navController) }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(Screen.Home.route) { HomeScreen() }
            composable(Screen.Favorites.route) { FavoritesScreen() }
            composable(Screen.Profile.route) { ProfileScreen() }
        }
    }
}