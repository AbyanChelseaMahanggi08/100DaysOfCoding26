import java.util.Scanner;

public class Day50 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Masukkan Bilangan : ");
int a = sc.nextInt();

String hasil = (a % 2 == 0) ? "Genap" : "Ganjil";

System.out.println(hasil);

sc.close();

}
}
