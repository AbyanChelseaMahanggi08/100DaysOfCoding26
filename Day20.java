import java.util.Scanner;

public class Day20{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Masukkan umur\t : ");
int umur = sc.nextInt();
System.out.print("Masukkan nilai\t : ");
float nilai = sc.nextFloat();
System.out.print("Masukkan inisial : ");
char inisial = sc.next().charAt(0);

// Mengubah tipe data primitif menjadi string
String a = String.valueOf(umur);
String b = String.valueOf(nilai);
String c = String.valueOf(inisial);

System.out.println("\n========== NILAI STRING ==========");
System.out.println("Umur\t: " + (a+1));
System.out.println("Nilai\t: " + (b+1));
System.out.println("Inisial\t: " + c);

System.out.println("\n=========== NILAI ASLI ===========");
System.out.println("Umur\t: " + (umur+1));
System.out.println("Nilai\t: " + (nilai+1));
System.out.println("Inisial\t: " + inisial);


sc.close();


}
}
