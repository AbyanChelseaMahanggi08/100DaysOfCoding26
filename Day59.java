import java.util.Scanner;

public class Day59 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Masukkan Nilai M : ");
int m = sc.nextInt();
System.out.print("Masukkan Nilai N : ");
int n = sc.nextInt();

for (int a = 1; a <= n; a++) {
    if (a % m == 0) {
       System.out.println(a+" ");
    }
}

sc.close();

}
}
