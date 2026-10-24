# Character Manager — TP3 (Java Visual SIH-6406)

## Deskripsi

Program ini dibuat menggunakan Java untuk mengelola data karakter. Program menampilkan tiga karakter, mencoba fitur level up, dan menambahkan fitur mana serta isAlive().

## Screenshot Output

![Output program Java](src/com/unpri/charactermanager/screenshots/output.png)

## Struktur Folder

```text
CharacterManager/
├── bin/
├── src/
│   └── com/unpri/charactermanager/
│       ├── model/
│       │   ├── Character.java
│       │   └── CharacterType.java
│       └── Main.java
├── screenshots/
│   └── output.png
└── README.md
```

## Identitas Mahasiswa

- Nama: Refalin Echa Tiarma Silaban
- NIM: 253303621265
- Kelas: 3PAGIB

## Analisis Desain

Link Google Docs: https://docs.google.com/document/d/1oBb56zuPdNNHZe6EV0b_abqxww5cIXs-dns3gTZaIV0/edit?tab=t.0

## TP5 — Character Manager

### Fitur yang Ditambahkan

Pada TP5, program Character Manager dikembangkan dengan beberapa fitur untuk mempermudah pengelolaan karakter, yaitu:

- `addCharacter()` untuk menambahkan karakter dan menolak nama yang duplikat.
- `findByName()` untuk mencari karakter berdasarkan nama.
- `removeCharacter()` untuk menghapus karakter dari daftar.
- `getTotalCharacters()` untuk menghitung jumlah karakter yang tersimpan.
- `getAllCharacters()` untuk mendapatkan salinan daftar karakter.
- `getAverageLevel()` untuk menghitung rata-rata level karakter.
- `findByType()` untuk mencari karakter berdasarkan tipe.
- `findStrongest()` untuk mencari karakter dengan nilai attack tertinggi.

### Screenshot Output

**Output penambahan, pencarian, dan penghapusan karakter**

![Output CRUD TP5](src/com/unpri/charactermanager/screenshots/outputtp05.png)

**Output mini-challenge dan eksperimen reference**

![Output eksperimen TP5](src/com/unpri/charactermanager/screenshots/outputtp5.png)

### Fitur Analitik Rancangan Sendiri

Method `findStrongest()` dibuat untuk mencari karakter dengan nilai attack tertinggi dari daftar karakter yang tersimpan. Fitur ini ditambahkan agar program tidak hanya dapat mengelola data karakter, tetapi juga membantu membandingkan kekuatan serangan setiap karakter.

### Analisis Reference dan Rancangan

Dokumen analisis membahas penggunaan reference pada objek Java, perbedaan reference dengan tipe data primitif, penggunaan `static`, penyesuaian `equals()`, serta pentingnya mengembalikan salinan daftar untuk menjaga data internal.

Link Google Docs TP5: [Analisis Reference dan Rancangan Program Character Manager](https://docs.google.com/document/d/1hDeDd1LbydfVmSO68xuhlgy8NQ0NPCIgeXcDf-wmU8E/edit?usp=sharing)
