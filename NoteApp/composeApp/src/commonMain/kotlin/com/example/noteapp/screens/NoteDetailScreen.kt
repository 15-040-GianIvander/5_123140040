package com.example.noteapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.noteapp.KeepPrimary

@Composable
fun NoteDetailScreen(noteId: Int, onEditClick: () -> Unit, onBack: () -> Unit) {
    // Cari data berdasarkan ID dari state global
    val note = notesListState.find { it.id == noteId }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        // --- HEADER NAVIGATION ---
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp, vertical = 4.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            TextButton(onClick = onBack) {
                Text("Back", color = KeepPrimary, fontWeight = FontWeight.SemiBold)
            }

            Row(verticalAlignment = Alignment.CenterVertically) {
                // Tombol Favorite di Detail
                IconButton(onClick = { if (note != null) toggleFavoriteNote(note) }) {
                    Text(text = if (note?.isFavorite == true) "❤️" else "🤍")
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // --- CONTENT AREA ---
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
                .weight(1f) // Mengambil sisa ruang yang ada
        ) {
            if (note == null) {
                Text(
                    text = "Note not found",
                    style = MaterialTheme.typography.headlineSmall,
                    color = Color.Gray
                )
            } else {
                Text(
                    text = note.title,
                    style = MaterialTheme.typography.headlineMedium.copy(
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF202124)
                    )
                )

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = note.content,
                    style = MaterialTheme.typography.bodyLarge.copy(
                        color = Color(0xFF5F6368),
                        lineHeight = androidx.compose.ui.unit.TextUnit.Unspecified // Biar spacing antar baris pas
                    )
                )
            }
        }

        // --- BOTTOM ACTION ---
        Surface(
            tonalElevation = 2.dp,
            modifier = Modifier.fillMaxWidth(),
            color = Color.White
        ) {
            Box(modifier = Modifier.padding(16.dp)) {
                Button(
                    onClick = onEditClick,
                    modifier = Modifier.fillMaxWidth(),
                    shape = MaterialTheme.shapes.medium,
                    colors = ButtonDefaults.buttonColors(containerColor = KeepPrimary)
                ) {
                    Text("Edit Note", fontWeight = FontWeight.Bold)
                }
            }
        }
    }
}