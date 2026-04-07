package com.example.noteapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.noteapp.screens.AddNoteScreen
import com.example.noteapp.screens.EditNoteScreen
import com.example.noteapp.screens.FavoritesScreen
import com.example.noteapp.screens.NoteDetailScreen
import com.example.noteapp.screens.NoteListScreen
import com.example.noteapp.screens.ProfileScreen

@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Notes.route
    ) {
        // Tab: Notes List
        composable(Screen.Notes.route) {
            NoteListScreen(
                onNoteClick = { id -> navController.navigate(Screen.NoteDetail.createRoute(id)) },
                onAddClick = { navController.navigate(Screen.AddNote.route) }
            )
        }

        // Tab: Favorites
        composable(Screen.Favorites.route) {
            FavoritesScreen()
        }

        // Tab: Profile
        composable(Screen.Profile.route) {
            ProfileScreen()
        }

        // Screen: Add Note
        composable(Screen.AddNote.route) {
            AddNoteScreen(onBack = { navController.popBackStack() })
        }

        // Screen: Detail Note (With Arg)
        composable(
            route = Screen.NoteDetail.route,
            arguments = listOf(navArgument("noteId") { type = NavType.IntType })
        ) { backStackEntry ->
            val id = backStackEntry.arguments?.getInt("noteId") ?: 0
            NoteDetailScreen(
                noteId = id,
                onEditClick = { navController.navigate(Screen.EditNote.createRoute(id)) },
                onBack = { navController.popBackStack() }
            )
        }

        // Screen: Edit Note (With Arg)
        composable(
            route = Screen.EditNote.route,
            arguments = listOf(navArgument("noteId") { type = NavType.IntType })
        ) { backStackEntry ->
            val id = backStackEntry.arguments?.getInt("noteId") ?: 0
            EditNoteScreen(
                noteId = id,
                onBack = { navController.popBackStack() }
            )
        }
    }
}