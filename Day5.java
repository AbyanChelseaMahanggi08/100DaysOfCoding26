// Program mengenali tipe data Double Dan Float

public class Day5 {
  public static void main(String[] args) {
  
 /*
 * Digunakan untuk menyimpan bilangan desimal/pecahan dengan tingkat
 * ketelitian yang lebih tinggi dibandingkan Float. Berukuran 64 bit (8 Byte)
 */
  Double tinggi = 172.5;

 /*
 * Digunakan untuk menyimpan bilangan desimal/pecahan dengan tingkat
 * ketelitian yang lebih rendah dibanding Double. Berukuran 32 bit (4 Byte)
 */
  Float Kecepatan = 75.5f;

 // Menampilkan Dua Tipe Data (Double,Float) yang sudah kata buat
 System.out.println("Tinggi\t\t = " + tinggi +"cm");
 System.out.println("Kecepatan Motor\t = " + Kecepatan +"Km/Jam");
  }  
}
