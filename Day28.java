
import java.util.Scanner;

public class Day28 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Masukkan nilai a : ");
 int a = sc.nextInt();
System.out.print("Masukkan nilai b : ");
 int b = sc.nextInt();

System.out.println("\n\nHasil Sama Dengan (==)");
System.out.println(a == b);

System.out.println("\nHasil Tidak Sama Dengan (!=)");
System.out.println(a != b);


sc.close();


}
}
