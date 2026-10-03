
import java.util.Scanner;

public class Day32 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Masukkan umur peserta 1 : ");
int a = sc.nextInt();
System.out.print("Masukkan umur peserta 2 : ");
int b = sc.nextInt();

System.out.println("\n===== HASIL PEMERIKSAAN =====");

System.out.println("Umur kedua peserta sama?    : " + (a==b));
System.out.println("Umur kedua peserta berbeda? : " + (a!=b));

System.out.println("\nSelisih umur kedua peserta : " + (a%b) + " Tahun");

System.out.println("\nApakah peserta 1 bisa memiliki KTP       : " + (a>=17));
System.out.println("Apakah peserta 2 tidak bisa memiliki KTP : " + (b<=17));

System.out.println("\nApakah salah satu peserta tidak memiliki KTP : "
 + (a>=17 && b<=17) );
System.out.println("Apakah salah satu peserta memiliki KTP      : "
 + (a>=17 || b>17));

 
sc.close();


}    
}
