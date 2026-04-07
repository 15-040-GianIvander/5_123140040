package com.example.noteapp.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// --- MODEL DATA ---
data class Note(
    val id: Int,
    var title: String,
    var content: String,
    var isFavorite: Boolean = false
)

// --- STATE GLOBAL SEMENTARA ---
// Tips: Taruh ini di file terpisah kalau mau lebih rapi, tapi di sini juga oke buat tugas.
val notesListState = mutableStateListOf(
    Note(1, "Kuliah", "Hari ini ada praktikum Compose Multiplatform jam 11", true),
    Note(2, "Motor", "Ganti oli jam 3 sore di bengkel langganan", false),
    Note(3, "Tugas", "Kerjain bab 3 tugas akhir biar cepat lulus", false)
)

// --- FUNGSI BANTU ---
fun toggleFavoriteNote(note: Note) {
    val index = notesListState.indexOfFirst { it.id == note.id }
    if (index != -1) {
        notesListState[index] = note.copy(isFavorite = !note.isFavorite)
    }
}

// --- HOME SCREEN ---
@Composable
fun NoteListScreen(onNoteClick: (Int) -> Unit, onAddClick: () -> Unit) {
    Scaffold(
        containerColor = Color.White, // Background putih bersih
        floatingActionButton = {
            ExtendedFloatingActionButton(
                onClick = onAddClick,
                containerColor = Color(0xFF4285F4), // Biru Google
                contentColor = Color.White,
                icon = { Text("+", fontSize = 24.sp) },
                text = { Text("Note") }
            )
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize()
                .padding(horizontal = 16.dp)
        ) {
            item {
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "Catatanku",
                    style = MaterialTheme.typography.headlineMedium.copy(
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF202124)
                    )
                )
                Spacer(modifier = Modifier.height(16.dp))
            }

            items(notesListState) { note ->
                NoteCardComponent(
                    note = note,
                    onCardClick = { onNoteClick(note.id) }
                )
            }

            // Spacer bawah biar ga ketutupan FAB
            item { Spacer(modifier = Modifier.height(80.dp)) }
        }
    }
}

// --- KOMPONEN CARD REUSABLE (Dipakai di Home & Favorite) ---
@Composable
fun NoteCardComponent(note: Note, onCardClick: () -> Unit) {
    OutlinedCard(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp)
            .clickable { onCardClick() },
        shape = MaterialTheme.shapes.medium,
        border = CardDefaults.outlinedCardBorder().copy(width = 0.5.dp),
        colors = CardDefaults.outlinedCardColors(containerColor = Color.White)
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.Top
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = note.title,
                    style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.SemiBold),
                    color = Color(0xFF202124),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = note.content,
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color(0xFF5F6368), // Abu-abu Google Keep
                    maxLines = 3,
                    overflow = TextOverflow.Ellipsis
                )
            }

            // Icon Favorite yang lebih subtle
            IconButton(
                onClick = { toggleFavoriteNote(note) },
                modifier = Modifier.size(24.dp)
            ) {
                Text(
                    text = if (note.isFavorite) "❤️" else "🤍",
                    fontSize = 16.sp
                )
            }
        }
    }
}