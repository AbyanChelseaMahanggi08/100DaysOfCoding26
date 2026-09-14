
import java.util.Scanner;

public class Day13 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in); 

System.out.print("Masukkan nama Lengkap : ");
String namaLengkap = sc.nextLine();
System.out.print("Masukkan nama Panggilan : ");
String namaPanggilan = sc.nextLine();
System.out.print("Masukkan Umur : ");
int umur = sc.nextInt();
System.out.print("Masukkan Tinggi Badan : ");
double tb = sc.nextDouble();

System.out.println("Nama saya " + namaLengkap + ", Kamu bisa panggil saya " + namaPanggilan +
 " umur saya " + umur + " dan tinggi saya " + tb + "CM.");
}    
}
