package com.example.noteapp.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun FavoritesScreen() {
    // FILTER DARI STATE GLOBAL
    val favoriteNotes = notesListState.filter { it.isFavorite }

    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text("Favorite Notes", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(16.dp))

        if (favoriteNotes.isEmpty()) {
            Text("Belum ada note favorit.", style = MaterialTheme.typography.bodySmall)
        } else {
            LazyColumn {
                items(favoriteNotes) { note ->
                    // PANGGIL KOMPONEN CARD YANG SAMA SEPERTI DI HOMESCREEN
                    NoteCardComponent(note = note, onCardClick = { /* Detail di Favorite */ })
                }
            }
        }
    }
}