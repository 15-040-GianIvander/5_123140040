package com.example.notesapp.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class) // WAJIB TAMBAHKAN INI
@Composable
fun NoteListScreen(onNoteClick: (Int) -> Unit) {
    val notes = listOf(1, 2, 3, 4, 5)

    Scaffold(
        topBar = {
            // Ubah SmallTopAppBar menjadi TopAppBar
            TopAppBar(
                title = { Text("Notes App", color = Color.White) },
                // Ubah smallTopAppBarColors menjadi topAppBarColors
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.Blue)
            )
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier.fillMaxSize().padding(padding).padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            items(notes) { id ->
                Button(
                    onClick = { onNoteClick(id) },
                    modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF2196F3))
                ) {
                    Text("Lihat Note ID: $id")
                }
            }
        }
    }
}