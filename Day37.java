
import java.util.Scanner;

public class Day37 {
public static void main(String[] args) {
Scanner sc = new Scanner (System.in);

System.out.print("Masukkan Angka : ");
int a = sc.nextInt();


if (a>0) {
    System.out.println("Bilangan Positif");
}
else if (a<0) {
    System.out.println("Bilangan Negatif");
}
else {
    System.out.println("0 Bukan Bilangan Positif Maupun Negatif");
}


sc.close();


}
}
