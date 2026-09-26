import java.util.Scanner;

public class Day25 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Masukkan jari-jari : ");
double jariJari = sc.nextDouble();
System.out.print("Masukkan PI        : ");
double pi = sc.nextDouble();

double luas = pi*jariJari*jariJari;

System.out.println("\n======= HASIL =======");
System.out.printf("Luas lingkaran = %.0f CM²",luas);

sc.close();


}
}
