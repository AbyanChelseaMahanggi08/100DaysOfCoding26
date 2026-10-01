
import java.util.Scanner;

public class Day30 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Masukkan nilai Angga : ");
int a = sc.nextInt();
System.out.print("Masukkan nilai Reza  : ");
int b = sc.nextInt();

boolean hasil1 = a>=b;
boolean hasil2 = a<=b;

System.out.println("\n===== HASIL =====");
System.out.println("Apakah Nilai Angga Lebih besar dari Reza? : "+hasil1);
System.out.println("Apakah Nilai Angga Lebih kecil dari Reza? : "+hasil2);

}    
}
