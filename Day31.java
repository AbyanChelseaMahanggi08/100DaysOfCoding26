
import java.util.Scanner;

public class Day31 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);


// Operator Logika AND (&&)
System.out.print("Masukkan nilai : ");
int nilai = sc.nextInt();
boolean lulus = true;
System.out.println("(&&) Apakah saya lulus : " + (nilai >= 90 && lulus));


// Operator Logika OR (||)
boolean belajar = true;
boolean bermain = true;
System.out.println("(||) Apakah tujuan saya kuliah untuk belajar : " + (bermain || belajar));


// Operator Logika NOT (!)
System.out.println("\n\n(!)" + !bermain);


sc.close();


}    
}
