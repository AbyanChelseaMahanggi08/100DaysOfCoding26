import java.util.Scanner;

public class Day18 {
public static void main(String[] args) {

// Konversi Otomatis

Scanner sc = new Scanner(System.in);

// Meminta pengguna memasukkan angka bertipe int
System.out.print("Masukkan angka : ");
int angka = sc.nextInt();

// Konversi otomatis dari int ke double
double hasilKonversi = angka;

System.out.println("Nilai int    : " + angka);
System.out.println("Nilai double : " + hasilKonversi);

sc.close();

}
}
