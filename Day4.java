//Program mempelajari Tipe Data Numerik bilangan bulat (Byte,Short,Int,Long)
public class Day4 {
public static void main(String[] args) {

/* 
* Tipe Data Byte
* Digunakan untuk menyimpan bilangan bulat sangat kecil dengan rentang nilai dari -128 hingga 127,
* Berukuran 8-bit (1 byte)
*/
  byte umur = 18;

/*
* Tipe Data Short
* Digunakan untuk menyimpan bilangan bulat yang relatif kecil dengan rentang nilai -32.768 hingga
* 32.767, Berukuran 16-bit (2 byte)
*/
  short JumlahKaryawan = 2500;

/* 
* Tipe Data Int
* Digunakan untuk menyimpan bilangan bulat umum dengan rentang nilai
* -2.147.483.648 Hingga 2.147.483.647, Berukuran 32-bit (4 byte)
*/
  int GajiPerbulan = 5500000;

/* 
* Tipe Data Long
* Digunakan untuk menyimpan bilangan bulat yang sangat besar dengan rentang nilai
* -9.223.372.036.854.775.808 sampai 9.223.372.036.854.775.807, Berukuran  64-bit (8 byte)
*/
  long JumlahPendudukIndonesia = 290125073;

// Menampilkan Tipe Data yang sudah kita buat 
  System.out.println("umur\t\t\t  : " + umur);
  System.out.println("Jumlah Karyawan\t\t  : " + JumlahKaryawan);
  System.out.println("Gaji Perbulan\t\t  : " + GajiPerbulan);
  System.out.println("Jumlah Penduduk Indonesia : " + JumlahPendudukIndonesia);

}
}
