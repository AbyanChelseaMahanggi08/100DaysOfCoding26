
import java.util.Scanner;

public class Day27 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Masukkan nilai awal : ");
int angka = sc.nextInt();

System.out.println("\n=== Increment ===");
angka++; 
System.out.println("Sesudah Increment : "+ angka);


System.out.println("\n\n=== Decrement ===");
angka--;
System.out.println("Sesudah Decrement : "+ angka);

sc.close();

}    
}
