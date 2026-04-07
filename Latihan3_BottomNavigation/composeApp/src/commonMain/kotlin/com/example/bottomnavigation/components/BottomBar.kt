package com.example.bottomnavigation.components

import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.bottomnavigation.navigation.Screen // Import sealed class-nya

@Composable
fun BottomBar(navController: NavController) {
    val screens = listOf(Screen.Home, Screen.Favorites, Screen.Profile)
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    NavigationBar(containerColor = Color(0xFFE3F2FD)) {
        screens.forEach { screen ->
            val isSelected = currentDestination?.route == screen.route
            NavigationBarItem(
                selected = isSelected,
                label = { Text(screen.label) },
                icon = {},
                onClick = {
                    navController.navigate(screen.route) {
                        popUpTo(navController.graph.startDestinationRoute ?: screen.route) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }
}