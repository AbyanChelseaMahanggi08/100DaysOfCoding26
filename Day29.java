
import java.util.Scanner;

public class Day29 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Masukkan nilai a : ");
int a = sc.nextInt();
System.out.print("Masukkan nilai b : ");
int b = sc.nextInt();

System.out.println("\nApakah nilai a lebih besar dari nilai b? : " + (a > b));
System.out.println("Apakah nilai a lebih kecil dari nilai b? : " + (a < b));


sc.close();


}    
}
