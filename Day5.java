// Program mengenali tipe data double Dan float

public class Day5 {
  public static void main(String[] args) {
  
 /*
 * Digunakan untuk menyimpan bilangan desimal/pecahan dengan tingkat
 * ketelitian yang lebih tinggi dibandingkan float. Berukuran 64 bit (8 Byte)
 */
  double tinggi = 172.5;

 /*
 * Digunakan untuk menyimpan bilangan desimal/pecahan dengan tingkat
 * ketelitian yang lebih rendah dibanding double. Berukuran 32 bit (4 Byte)
 */
  float Kecepatan = 75.5f;

 // Menampilkan Dua Tipe Data (double,float) yang sudah kata buat
 System.out.println("Tinggi\t\t = " + tinggi +"cm");
 System.out.println("Kecepatan Motor\t = " + Kecepatan +"Km/Jam");
  }  
}
