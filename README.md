# Responsi Akhir PBO – Sistem SPBU

## Identitas
-**Nama:** KALINA AULIA BRILIANI
-**NIM :** H1D025002
-**Tema:** SPBU (digit terakhir NIM 2)

## Cara Menjalankan Program

Sebelum menjalankan program, pastikan JDK sudah terpasang di komputer. Setelah itu, buka terminal pada folder utama repository dan jalankan perintah berikut:

```bash
javac -d out *.java
java -cp out Main
```

Perintah pertama digunakan untuk meng-compile seluruh file Java, sedangkan perintah kedua digunakan untuk menjalankan program melalui class `Main`.

## Screenshot Hasil Program

Berikut merupakan tampilan hasil program setelah dijalankan:

![Output program](OUTPUT.png)

## Pemetaan Persyaratan Teknis

Berikut penjelasan konsep PBO yang digunakan dalam program Sistem SPBU beserta penerapannya di dalam kode.

| No. | Konsep | Penerapan dalam Program |
|---|---|---|
| 1 | State dan Behavior | Class `Dispenser` memiliki atribut untuk menyimpan kondisi dispenser. Method `tampilkanInfo()` digunakan untuk menampilkan informasi, sedangkan `hitungHarga()` digunakan untuk menghitung total harga bahan bakar. |
| 2 | Immutability | Konstanta `KAPASITAS_MAKS` menggunakan `static final`, sehingga nilainya tidak bisa diubah. Atribut `idDispenser` juga menggunakan `final` agar ID tetap sama setelah objek dibuat. |
| 3 | Enkapsulasi dan Overloading | Atribut dibuat `private` agar tidak bisa diakses langsung dari luar class, dan aksesnya melalui getter dan setter. Keyword `this` digunakan untuk membedakan atribut class dengan parameter. Program juga memiliki dua konstruktor `Dispenser` dengan jumlah parameter berbeda (overloaded constructor). |
| 4 | Inheritance | Class `DispenserPertamax`, `DispenserPertalite`, dan `DispenserSolar` merupakan turunan dari class `Dispenser` melalui `extends`, sehingga ketiganya bisa menggunakan atribut dan method dari class induk. Class `Main` dibuat di file terpisah khusus untuk pengujian. |
| 5 | Super Chaining | Kata kunci `super()` digunakan pada konstruktor subclass untuk memanggil konstruktor dari class `Dispenser`. Sementara itu, `super.tampilkanInfo()` digunakan untuk memanggil method milik class induk. |
| 6 | Method Overriding | Subclass memiliki implementasi method sendiri dengan menggunakan `@Override`, seperti `isiBahanBakar()`, `tampilkanInfo()`, `cetakStruk()`, dan `servis()`. |
| 7 | Abstract Class | Class `Dispenser` dibuat sebagai abstract class karena menjadi dasar bagi jenis dispenser lainnya. Method `isiBahanBakar()` juga dibuat abstract agar setiap subclass memiliki implementasinya masing-masing. |
| 8 | Logika State dan Percabangan | Percabangan `if/else` digunakan dalam method `isiBahanBakar()` untuk memeriksa kondisi stok sebelum melakukan pengisian dan memperbarui jumlah stok setelahnya. |
| 9 | Polimorfisme Interface | Interface `Struk` digunakan sebagai tipe referensi untuk objek `DispenserPertamax`, yaitu `Struk struk = new DispenserPertamax(...)` di `Main`. Method `cetakStruk()` lalu dipanggil lewat variabel `struk`. |
| 10 | Multiple Interface | Class `DispenserPertamax` menggunakan `implements Struk, Servis`, sehingga punya dua kemampuan sekaligus: mencetak struk (`cetakStruk()`) dan diservis (`servis()`). |
