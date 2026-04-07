package com.example.notesapp.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class) // WAJIB TAMBAHKAN INI
@Composable
fun NoteDetailScreen(noteId: Int, onBack: () -> Unit) {
    Scaffold(
        topBar = {
            // Ubah SmallTopAppBar menjadi TopAppBar
            TopAppBar(
                title = { Text("Detail Note", color = Color.White) },
                // Ubah smallTopAppBarColors menjadi topAppBarColors
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.Blue)
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier.fillMaxSize().padding(padding),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Detail Note ID: $noteId",
                style = MaterialTheme.typography.headlineMedium,
                color = Color.Blue
            )

            Spacer(modifier = Modifier.height(24.dp))

            Button(
                onClick = onBack,
                colors = ButtonDefaults.buttonColors(containerColor = Color.Gray)
            ) {
                Text("Kembali")
            }
        }
    }
}