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
- **Home (Note List)**  
 <img width="1080" height="2400" alt="Screenshot_20260407_125658" src="https://github.com/user-attachments/assets/c0ebc3ed-1359-431c-b490-4601fbb8b502" />

- **Note Detail**  
<img width="1080" height="2400" alt="Screenshot_20260407_125723" src="https://github.com/user-attachments/assets/87a00b15-ea77-48de-ae2c-600f02de9607" />

- **Add / New Note**  
<img width="1080" height="2400" alt="Screenshot_20260407_125739" src="https://github.com/user-attachments/assets/d5547130-739a-4e22-8b1d-5a4fcc2808da" />

- **Edit Note**
  <img width="1080" height="2400" alt="Screenshot_20260407_125752" src="https://github.com/user-attachments/assets/27c050ad-d31c-4f5c-8e9b-c22c7bb4dd83" />

- **Favorites Notes**  
<img width="1080" height="2400" alt="Screenshot_20260407_125810" src="https://github.com/user-attachments/assets/84333a8d-b668-4139-bc92-31b1db625fc8" />

- **Profile**
<img width="1080" height="2400" alt="Screenshot_20260407_125820" src="https://github.com/user-attachments/assets/6b2075d7-bd25-4803-8945-5bb4100ecc53" />

---

## 🎥 Video Demo

`[Link Video Demo]`

---

## 🛠️ Tech Stack

- **Compose Multiplatform**
- **Navigation Compose**
  - Version: `2.7.0-alpha07`
- **Material Design 3**
