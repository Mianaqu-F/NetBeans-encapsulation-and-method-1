# Project EncapsulationDanMethod

## Deskripsi
Project ini menunjukkan implementasi enkapsulasi dan method dalam Java melalui sistem kelas Person sederhana.

### Berkas Utama

1. **EncapsulationDanMethod.java**
   - Berisi kelas utama dan titik masuk program
   - Mendemonstrasikan penggunaan kelas Person
   - Menunjukkan pembuatan dan manipulasi objek

2. **Person.java**
   - Mengimplementasikan kelas Person dengan properti terenkapsulasi:
     - nama (String)
     - umur (int)
   - Fitur-fitur:
     - Field private
     - Getter dan setter publik
     - Validasi umur
     - Method untuk menampilkan informasi

## Fitur-Fitur
- Enkapsulasi data person
- Validasi data untuk umur (harus positif)
- Method getter dan setter
- Fungsi menampilkan informasi
- Konstruktor dengan validasi parameter

## Contoh Penggunaan
```java
Person person = new Person("John", 25);
person.displayInfo();           // Menampilkan: Name: John, Age: 25
person.setName("Alice");
person.setAge(30);
person.displayInfo();           // Menampilkan: Name: Alice, Age: 30
```

### Perlindungan Data
Nama dan umur adalah field private
Umur memiliki validasi untuk memastikan nilai positif
Enkapsulasi menjamin integritas data melalui akses terkontrol

### Manfaat Pembelajaran
Memahami konsep enkapsulasi dalam Java
Implementasi getter dan setter
Penerapan validasi data
Penggunaan konstruktor
Pengelolaan akses data private


