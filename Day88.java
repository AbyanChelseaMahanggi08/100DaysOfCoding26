
import java.util.Scanner;

public class Day88 {
static void tampilkanBiodata(String nama, int umur) {
    System.out.println("Nama : "+nama);
    System.out.println("Umur : "+umur);   
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Masukkan Nama : ");
String nama = sc.nextLine();
System.out.print("Masukkan Umur : ");
int umur = sc.nextInt();

tampilkanBiodata(nama, umur);

}
}
