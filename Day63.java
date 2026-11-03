import java.util.Scanner;

public class Day63 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int m = sc.nextInt();
int n = sc.nextInt();
int hasil = 1;

for (int a = 1; a <= n; a++) {
    hasil = hasil *= m;
}
 
System.out.println("Hasil : "+hasil);

sc.close();

}
}
