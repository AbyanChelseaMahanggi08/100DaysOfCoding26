// Pengenalan Scanner
import java.util.Scanner;

public class Day11 {
public static void main(String[] args) {

 Scanner sc = new Scanner(System.in);

 //Contoh untuk membuat penginputan menggunakan tipe data

 // String
 System.out.print("Masukkan nama : ");
 String nama = sc.nextLine();

 // char
 System.out.print("Masukkan jenis kelamin (L/P) : ");
 char jenisKelamin = sc.next().charAt(0);

 // byte
 System.out.print("Masukkan umur : ");
 byte umur = sc.nextByte();

 // short
 System.out.print("Masukkan tahun lahir : ");
 short tahunLahir = sc.nextShort();

 // int
 System.out.print("Masukkan nomor absen : ");
 int nomorAbsen = sc.nextInt();

 // long
 System.out.print("Masukkan nomor induk : ");
 long nomorInduk = sc.nextLong();

 // float
 System.out.print("Masukkan tinggi badan : ");
 float tinggi = sc.nextFloat();

 // double
 System.out.print("Masukkan berat badan : ");
 double berat = sc.nextDouble();

 // boolean
 System.out.print("Apakah mahasiswa aktif? (true/false): ");
 boolean mahasiswaAktif = sc.nextBoolean();

 // Menampilkan hasil inputan
 System.out.println("\n============== DATA PRIBADI ==============");
 System.out.println("Nama            : " + nama);
 System.out.println("Jenis Kelamin   : " + jenisKelamin);
 System.out.println("Umur            : " + umur + " tahun");
 System.out.println("Tahun Lahir     : " + tahunLahir);
 System.out.println("Nomor Absen     : " + nomorAbsen);
 System.out.println("Nomor Induk     : " + nomorInduk);
 System.out.println("Tinggi Badan    : " + tinggi + " cm");
 System.out.println("Berat Badan     : " + berat + " kg");
 System.out.println("Mahasiswa Aktif : " + mahasiswaAktif);

 sc.close();


}
}
