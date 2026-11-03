
import java.util.Scanner;

public class Day63 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Masukkan nilai N : ");
int n = sc.nextInt();
int hasil = 1;

for (int a = n; a >= 1; a--) {
    hasil *= a;
}

System.out.println("Faktorial : "+hasil);

sc.close();

}
}
