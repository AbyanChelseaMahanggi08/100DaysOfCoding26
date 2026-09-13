// Membuat Program Biodata Sederhana Menggunakan Scanner
import java.util.Scanner ;

public class Day12 {
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 
 // Proses Penginputan Biodata
 System.out.print("Masukkan Nama : ");
 String nama = sc.nextLine();

 System.out.print("Masukkan Tempat Tanggal lahir : ");
 String ttl = sc.nextLine();

 System.out.print("Masukkan Alamat : ");
 String alamat = sc.nextLine();

 System.out.print("Masukkan Umur : ");
 int umur = sc.nextInt();

 System.out.print("Masukkan Tinggi Badan : ");
 double tinggiBadan = sc.nextDouble();

 System.out.print("Masukkan Berat Badan : ");
 float beratBadan = sc.nextFloat();


 // Menampilkan Hasil Biodata
 System.out.println("\n========== BIODATA DIRI ==========");
 System.out.println("NAMA         : " + nama);
 System.out.println("TTL          : " + ttl);
 System.out.println("ALAMAT       : " + alamat);
 System.out.println("UMUR         : " + umur +" TAHUN");
 System.out.println("TINGGI BADAN : " + tinggiBadan +" CM");
 System.out.println("BERAT BADAN  : " + beratBadan +" KG");

}   
}
