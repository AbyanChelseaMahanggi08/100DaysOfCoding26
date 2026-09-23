
import java.util.Scanner;

public class Day22 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Masukkan angka ke nilai variable 1 : ");
int angka1 = sc.nextInt();
System.out.print("Masukkan angka ke nilai variable 2 : ");
int angka2 = sc.nextInt();

System.out.println("\n======= HASIL =======");
System.out.println("Sebelum ditukar : ");
System.out.println("Angka1 = "+ angka1);
System.out.println("Angka2 = "+ angka2);

// Menukar nilai variable
int temp = angka1;
angka1 = angka2;
angka2 = temp;

System.out.println("\nSetelah ditukar : ");
System.out.println("Angka = " + angka1);
System.out.println("Angka = " + angka2);

}
}
