package com.example.bottomnavigation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF0F7FF)) // Background biru sangat pudar
            .padding(16.dp)
    ) {
        // Header
        Text(
            text = "Halo, Gian!",
            fontSize = 28.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Color(0xFF1976D2) // Biru Primary
        )

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Aktivitas Terbaru",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF0D47A1)
        )

        Spacer(modifier = Modifier.height(12.dp))

        // Daftar Konten Menggunakan LazyColumn (List)
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(5) { index ->
                InfoItem(title = "Tugas Kuliah ${index + 1}", subtitle = "Deadline: Besok")
            }
        }
    }
}

@Composable
fun InfoItem(title: String, subtitle: String) {
    Surface(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        color = Color.White,
        shadowElevation = 2.dp
    ) {
        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Pengganti Icon (Lingkaran Biru)
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .background(Color(0xFFBBDEFB), shape = RoundedCornerShape(8.dp)),
                contentAlignment = Alignment.Center
            ) {
                Text("${title.last()}", color = Color(0xFF1976D2), fontWeight = FontWeight.Bold)
            }

            Spacer(modifier = Modifier.width(16.dp))

            Column {
                Text(text = title, fontWeight = FontWeight.Bold, fontSize = 16.sp)
                Text(text = subtitle, fontSize = 12.sp, color = Color.Gray)
            }
        }
    }
}