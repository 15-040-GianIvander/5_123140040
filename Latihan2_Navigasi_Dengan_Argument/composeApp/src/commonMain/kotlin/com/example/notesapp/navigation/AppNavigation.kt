package com.example.notesapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

// Pastikan import layarmu juga ada
import com.example.notesapp.screens.NoteListScreen
import com.example.notesapp.screens.NoteDetailScreen

// Definisi Route menggunakan Sealed Class (Best Practice) [cite: 121, 123]
sealed class Screen(val route: String) {
    object NoteList : Screen("note_list")
    object NoteDetail : Screen("note_detail/{noteId}") {
        // Helper function untuk membuat rute dengan argument [cite: 130, 218]
        fun createRoute(noteId: Int) = "note_detail/$noteId"
    }
}

@Composable
fun AppNavigation() {
    // 1. Inisialisasi NavController [cite: 147]
    val navController = rememberNavController()

    // 2. Setup NavHost [cite: 148]
    NavHost(
        navController = navController,
        startDestination = Screen.NoteList.route
    ) {
        // Destination: Note List
        composable(route = Screen.NoteList.route) {
            NoteListScreen(
                onNoteClick = { id ->
                    // Navigasi ke detail dengan argument [cite: 160, 225]
                    navController.navigate(Screen.NoteDetail.createRoute(id))
                }
            )
        }

        // Destination: Note Detail dengan Argument [cite: 219, 220]
        composable(
            route = Screen.NoteDetail.route,
            arguments = listOf(
                navArgument("noteId") { type = NavType.IntType }
            )
        ) { backStackEntry ->
            // Mengambil argument dari backStackEntry [cite: 222, 223]
            val noteId = backStackEntry.arguments?.getInt("noteId") ?: 0

            NoteDetailScreen(
                noteId = noteId,
                onBack = {
                    // Kembali ke layar sebelumnya [cite: 170, 187]
                    navController.popBackStack()
                }
            )
        }
    }
}