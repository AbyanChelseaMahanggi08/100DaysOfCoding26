
import java.util.Scanner;

public class Day16 {
public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);

// Operator Aritmatika Modulus atau Sisa Bagi

System.out.print("Masukkan Angka 1 : ");
int angka1 = sc.nextInt();
System.out.print("Masukkan Angka 2 : ");
int angka2 = sc.nextInt();


System.out.println("\nHasil Modulus : " + angka1 % angka2);

sc.close();
}
}
