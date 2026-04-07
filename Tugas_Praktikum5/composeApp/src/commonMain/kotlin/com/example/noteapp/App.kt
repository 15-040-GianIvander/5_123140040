package com.example.noteapp

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.rememberNavController
import com.example.noteapp.components.BottomBar
import com.example.noteapp.navigation.AppNavigation

// Palet Warna Google Keep Style
val KeepBackground = Color(0xFFFFFFFF) // Putih bersih
val KeepSurface = Color(0xFFF1F3F4)    // Abu-abu muda untuk card/nav
val KeepPrimary = Color(0xFF4285F4)    // Biru Google
val KeepText = Color(0xFF202124)       // Hitam pekat untuk teks

@Composable
fun App() {
    val navController = rememberNavController()

    MaterialTheme(
        colorScheme = lightColorScheme(
            primary = KeepPrimary,
            surface = KeepBackground,
            background = KeepBackground,
            surfaceVariant = KeepSurface,
            onSurface = KeepText,
            onBackground = KeepText
        ),
        typography = Typography() // Gunakan font bawaan yang bersih
    ) {
        Scaffold(
            bottomBar = { BottomBar(navController) },
            containerColor = KeepBackground // Set background utama putih
        ) { innerPadding ->
            Box(modifier = Modifier.padding(innerPadding)) {
                AppNavigation(navController = navController)
            }
        }
    }
}