# Latihan 3: Bottom Navigation
Aplikasi mobile sederhana yang dibangun menggunakan Compose Multiplatform dengan fokus pada implementasi Navigation Compose dan desain UI yang bersih (clean) bertema biru. Proyek ini dikembangkan sebagai bagian dari tugas akademik di Teknik Informatika ITERA.

## 👤 Identitas Mahasiswa
* **Nama:** Gian
* **NIM:** 123140040
* **Program Studi:** Teknik Informatika
* **Instansi:** Institut Teknologi Sumatera (ITERA)

---

## 🚀 Fitur Utama 
- Bottom Navigation (3 Tab): Navigasi antar layar Home, Favorites, dan Profile.
- State Management: Menggunakan currentBackStackEntry untuk mendeteksi tab aktif secara real-time.
- Optimasi Navigasi: Implementasi popUpTo, launchSingleTop, dan restoreState untuk menjaga efisiensi back stack dan menghindari penumpukan memori.
- Material 3 UI: Desain minimalis tanpa menggunakan icon eksternal (Text-only navigation) dengan palet warna biru yang konsisten.

---

## 🛠️ Struktur Folder 
Proyek ini mengikuti struktur modular standar Kotlin Multiplatform (CommonMain):
```text
composeApp/src/commonMain/kotlin/
├── components/
│   └── BottomBar.kt       # Komponen NavigationBar kustom (Tanpa Icon)
├── navigation/
│   └── AppNavigation.kt  # Definisi NavHost dan Sealed Class rute
└── screens/
├── HomeScreen.kt      # Dashboard utama dengan LazyColumn
├── FavoritesScreen.kt # Layar konten favorit
└── ProfileScreen.kt   # Layar informasi profil pengguna 
```

---

## ⚙️ Spesifikasi Teknis 
- Language: Kotlin
- UI Framework: Compose Multiplatform (Material 3)
- Navigation Library: `org.jetbrains.androidx.navigation:navigation-compose:2.8.0-alpha10`
- Primary Color: **#1976D2 (Blue)**
- Background Color: **#F0F7FF (Light Blue)**

---

## 📖 Cara Instalasi & Menjalankan 
- Buka file composeApp/build.gradle.kts.
- Pastikan dependensi navigasi sudah terpasang:
```bash
Kotlin commonMain.dependencies { implementation(compose.material3)
implementation(\"org.jetbrains.androidx.navigation:navigation-compose:2.8.0-alpha10\")
} 
```
- Lakukan Sync Project with Gradle Files.
- Jalankan aplikasi pada Android Emulator atau iOS Simulator.

---

## 📸 Dokumentasi Output 
| Home Screen | Favorites Screen | Profile Screen |
|:------------|:----------------:|---------------:|
|             |                  |                |
