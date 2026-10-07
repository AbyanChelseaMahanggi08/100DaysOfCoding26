import java.util.Scanner;

public class Day36 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Masukkan Angka : ");
int a = sc.nextInt();

if (a%2 == 0) {
    System.out.println("Bilangan Genap");
}
else {
    System.out.println("Bilangan Ganjil");
}


sc.close();


}
}
