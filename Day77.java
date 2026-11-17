
import java.util.Scanner;

public class Day77 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Masukkan Nama Anda : ");
String nama = sc.nextLine();

System.out.println("Panjang Nama                   : "+ nama.length());
System.out.println("Ubah Menjadi Huruf Kapital     : "+ nama.toUpperCase());
System.out.println("Ubah Menjadi Huruf Kecil       : "+ nama.toLowerCase());
System.out.println("Tanpa Spasi Awal & Akhir       : "+ nama.trim());
System.out.println("Mengganti Huruf A Menjadi O    : "+ nama.replace("a", "o"));
System.out.println("Apakah Nama Mengandung Huruf a : "+ nama.contains("a"));
System.out.println("Apakah Nama Anda "+nama+"?   "+"     : " + nama.equalsIgnoreCase("Abyan"));
System.out.println("Apakah Anda Menginput Nama     : "+ nama.isEmpty());

if (nama.length() >= 2) {
    System.out.println("3 Huruf Depan Akan Dihapus     : "+ nama.substring(2,5));
}
else {
    System.out.println("Nama Terlalu Pendek Untuk Substring");
}

sc.close();

}
}
