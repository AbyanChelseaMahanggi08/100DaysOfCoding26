
import java.util.Scanner;

public class Day62 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Masukkan Jumlah baris : ");
int jumlah = sc.nextInt();

for (int a = 1; a <= jumlah; a++) {
    for (int b = 1; b <= a; b++) {
        System.out.print(b+" ");
    }
    System.out.println();
}

sc.close();

}
}
