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
| Home (Note List) | Note Detail | Add / New Note |
|:----------------:|:-----------:|:--------------:|
| <img src="https://github.com/user-attachments/assets/c0ebc3ed-1359-431c-b490-4601fbb8b502" width="250"/> | <img src="https://github.com/user-attachments/assets/87a00b15-ea77-48de-ae2c-600f02de9607" width="250"/> | <img src="https://github.com/user-attachments/assets/d5547130-739a-4e22-8b1d-5a4fcc2808da" width="250"/> |

| Edit Note | Favorites Notes | Profile |
|:---------:|:---------------:|:-------:|
| <img src="https://github.com/user-attachments/assets/27c050ad-d31c-4f5c-8e9b-c22c7bb4dd83" width="250"/> | <img src="https://github.com/user-attachments/assets/84333a8d-b668-4139-bc92-31b1db625fc8" width="250"/> | <img src="https://github.com/user-attachments/assets/6b2075d7-bd25-4803-8945-5bb4100ecc53" width="250"/> |

---

## 🎥 Video Demo
https://github.com/user-attachments/assets/6eca7d4b-c7b1-4fe8-a127-55b57590d1ed

---

## 🛠️ Tech Stack

- **Compose Multiplatform**
- **Navigation Compose**
  - Version: `2.7.0-alpha07`
- **Material Design 3**
