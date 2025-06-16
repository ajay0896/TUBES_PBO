# TUBES_PBO

## Deskripsi
TUBES_PBO adalah proyek yang dirancang untuk mengembangkan sistem pengelolaan produk bagi Velora, sebuah platform penyedia rekomendasi produk perawatan kulit. Aplikasi ini memungkinkan admin untuk mengelola produk skincare secara efisien, termasuk menambah, mengedit, dan menghapus produk yang tersedia.

## Fitur Utama
- **Pengelolaan Produk:** Admin dapat menambahkan, mengedit, dan menghapus produk perawatan kulit dengan mudah.
- **Antarmuka Pengguna yang Ramah:** Halaman admin dirancang untuk memungkinkan navigasi yang intuitif dan efisien.
- **Integrasi Database:** Produk disimpan dalam basis data MySQL untuk pengelolaan data yang lebih efisien.

## Teknologi yang Digunakan
Proyek ini menggunakan teknologi dan alat berikut:
- **Bahasa Pemrograman:** Java
- **IDE:** NetBeans
- **Database:** MySQL
- **Library:** 
  - **mysql-connector-j-9.2.0.jar**: Untuk koneksi dan interaksi dengan database MySQL.
  - **JavaSwing**: Untuk antarmuka pengguna desktop.

## Prerequisites
Sebelum menginstal proyek ini, pastikan Anda memiliki:
- JDK (Java Development Kit) versi 8 atau lebih baru.
- MySQL Server terinstal dan berjalan.
- IDE NetBeans terinstal di komputer Anda.

## Instalasi

### 1. Clone Repositori
Clone repositori ini ke komputer Anda dengan menggunakan perintah:
```bash  
git clone https://github.com/username/TUBES_PBO.git  
cd TUBES_PBO
```

### 2. Konfigurasi Database
Buat Database
Buka MySQL dan buat database baru dengan nama, misalnya, velora_products.

```sql
CREATE DATABASE velora_products;
```
### 3. Tambahkan MySQL Connector
- Download mysql-connector-j-9.2.0.jar dari situs resmi MySQL.
- Tambahkan library tersebut ke proyek Anda di NetBeans:
  - Klik kanan pada proyek Anda di NetBeans.
  - Pilih Properties.
  - Pilih Libraries.
  - Klik Add JAR/Folder dan cari mysql-connector-j-9.2.0.jar yang telah diunduh.
  - Klik OK untuk menambahkan library.

### 4. Konfigurasi Koneksi Database
Update konfigurasi koneksi database di file sumber (biasanya di kelas konfigurasi atau kelas utama) menggunakan informasi koneksi yang sesuai:

```java
String url = "jdbc:mysql://localhost:3306/velora_products";
String user = "yourUsername";  // Ganti dengan username database Anda
String password = "yourPassword";  // Ganti dengan password database Anda
```

### 5. Jalankan Aplikasi
Buka proyek di NetBeans dan jalankan aplikasi. Anda bisa melakukannya dengan memilih proyek dan mengklik kanan pada proyek tersebut, kemudian memilih Run.




