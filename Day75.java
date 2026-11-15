
import java.util.Scanner;

public class Day75 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Masukkan kata pertama : ");
String a = input.nextLine();

System.out.print("Masukkan kata kedua   : ");
String b = input.nextLine();

System.out.println("Equals: " + a.equals(b));

System.out.println("Equals Ignore Case: " +
    a.equalsIgnoreCase(b));

System.out.println("Contains: " +
    a.contains(b));

System.out.println("Is Empty: " + b.isEmpty());

input.close();

}
}
