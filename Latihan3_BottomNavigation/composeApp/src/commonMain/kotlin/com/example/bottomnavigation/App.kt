package com.example.bottomnavigation

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.example.bottomnavigation.navigation.AppNavigation

@Composable
fun App() {
    MaterialTheme {
        AppNavigation()
    }
}