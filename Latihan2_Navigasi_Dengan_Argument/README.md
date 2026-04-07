# Latihan 2: Navigasi dengan Argument (Notes App)

Aplikasi sederhana berbasis **Compose Multiplatform** untuk memenuhi tugas **Latihan 2: Navigasi dengan Argument** pada mata kuliah Pengembangan Aplikasi Mobile.

## 👤 Identitas Mahasiswa
* **Nama:** Gian
* **NIM:** 123140040
* **Program Studi:** Teknik Informatika
* **Instansi:** Institut Teknologi Sumatera (ITERA)

---

## 📝 Deskripsi Latihan
Pada latihan ini, aplikasi mengimplementasikan perpindahan layar dari daftar catatan (*Note List*) menuju detail catatan (*Note Detail*) dengan membawa argumen berupa ID catatan (`noteId`).

### Fitur Utama:
* Implementasi navigasi antar layar menggunakan Compose Navigation.
* Pengiriman data (`noteId`) sebagai argumen antar *route*.
* Manajemen navigasi yang terstruktur menggunakan *Sealed Class*.

---

## 📸 Screenshots Hasil
- Layar Note List:<img width="1080" height="2400" alt="Screenshot_20260405_221049" src="https://github.com/user-attachments/assets/f190db75-fb9c-4093-abe2-5129ebe6e077" />
- Layar Note Detail:<img width="1080" height="2400" alt="Screenshot_20260405_221058" src="https://github.com/user-attachments/assets/74645e52-f592-4d05-8313-7682064b39c9" />

---

## 📂 Struktur File
```text
com.example.notesapp
 ┣ 📂 navigation
 ┃  ┗ 📄 AppNavigation.kt
 ┣ 📂 screens
 ┃  ┣ 📄 NoteListScreen.kt
 ┃  ┗ 📄 NoteDetailScreen.kt
 ┗ 📄 App.kt
```

---

## 🛠️ Tech Stack & Library
* **Language:** Kotlin
* **Framework:** Compose Multiplatform
* **Library Navigasi:** `org.jetbrains.androidx.navigation:navigation-compose:2.7.0-alpha07`
* **Desain UI:** Material 3 (Declarative UI Pattern)
