
import java.util.Scanner;

public class Day21 {
public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);

System.out.print("Masukkan Umur\t\t: ");
String umur = sc.nextLine();
System.out.print("Masukkan Tinggi Badan\t: ");
String tb = sc.nextLine();
System.out.print("Masukkan Berat Badan\t: ");
String bb = sc.nextLine();

int a = Integer.parseInt(umur);
double b = Double.parseDouble(tb);
float c = Float.parseFloat(bb);

System.out.println("\n========== HASIL ==========");
System.out.println("Umur\t\t: " + a);
System.out.println("Tinggi Badan\t: " + b);
System.out.println("Berat Badan\t: " + c);


sc.close();

}  
}
