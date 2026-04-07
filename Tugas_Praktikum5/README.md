# 📝 Notes App - Week 5: Navigation Implementation

Aplikasi **Notes App** ini merupakan pengembangan dari versi sebelumnya dengan penambahan sistem navigasi multi-screen menggunakan **Navigation Compose** pada **Compose Multiplatform**.

---

## 👤 Identitas Mahasiswa

- **Nama:** Gian Ivander
- **NIM:** 123140040
- **Program Studi:** Teknik Informatika

---

## ✨ Fitur Navigasi

Aplikasi ini telah mengimplementasikan fitur navigasi utama sebagai berikut:

- **Bottom Navigation**
  - Terdiri dari 3 tab utama:
    - Notes
    - Favorites
    - Profile

- **Detail Navigation**
  - Navigasi dari Note List ke Note Detail
  - Mengirimkan parameter `noteId` (Int)

- **Action Navigation**
  - Tombol **Floating Action Button (FAB)**
  - Mengarahkan ke halaman **Add Note**

- **Edit Navigation**
  - Halaman Edit Note menerima parameter `noteId`
  - Digunakan untuk mengubah data catatan

- **Back Navigation**
  - Menggunakan `popBackStack()`
  - Navigasi kembali mengikuti urutan riwayat dengan benar

---

## 📂 Struktur Folder

```
├── navigation/
│   ├── AppNavigation.kt   // NavHost utama
│   └── Routes.kt          // Sealed class untuk routing
│
├── screens/
│   ├── NotesScreen.kt
│   ├── DetailScreen.kt
│   ├── AddNoteScreen.kt
│   ├── EditNoteScreen.kt
│   ├── FavoritesScreen.kt
│   └── ProfileScreen.kt
│
├── components/
│   └── BottomBar.kt       // Bottom Navigation UI
```

---

## 🗺️ Navigation Flow

### Alur Navigasi:

- **Notes → Detail → Edit**
  - Menggunakan `navigate()` untuk berpindah layar
  - Menggunakan `popBackStack()` untuk kembali

- **Bottom Tab Navigation**
  - Menggunakan:
    - `popUpTo`
    - `launchSingleTop`
  - Bertujuan menjaga **back stack tetap rapi** saat berpindah tab

---

## 📸 Screenshots

> *(Tambahkan screenshot hasil aplikasi di bawah ini)*

- **Home (Note List)**  
  `[Screenshot]`

- **Note Detail**  
  `[Screenshot]`

- **Add / Edit Note**  
  `[Screenshot]`

- **Profile & Favorites**  
  `[Screenshot]`

---

## 🎥 Video Demo

`[Link Video Demo]`

---

## 🛠️ Tech Stack

- **Compose Multiplatform**
- **Navigation Compose**
  - Version: `2.7.0-alpha07`
- **Material Design 3**