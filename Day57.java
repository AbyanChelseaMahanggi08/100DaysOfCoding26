import java.util.Scanner;

public class Day57 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int n = sc.nextInt();

System.out.println("Genap : ");
for (int a = 2; a <= n; a+=2){
    System.out.print(a+" ");
}

System.out.println("\n");

System.out.println("Ganjil : ");
for (int a = 1; a <= n; a+=2){
    System.out.print(a+" ");
}

sc.close();

}
}
