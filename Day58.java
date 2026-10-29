import java.util.Scanner;

public class Day58 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int n = sc.nextInt();

System.out.println("Genap");
for (int a = n; a>=1; a--) {
    if (a % 2 == 0)
    System.out.print(a+" ");
}
 
System.out.println("Ganjil");
for (int a = n; a>=1; a--) {
    if (a % 2 != 0)
    System.out.print(a+" ");
}

sc.nextInt();

}
}
