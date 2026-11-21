import java.util.Scanner;

public class Day81 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int[] a = new int[5];

System.out.println("=== Mengisi Array ===");

for (int i = 0; i < a.length; i++) {
    a[i] = sc.nextInt();
}

System.out.println("=== Isi Array ===");

for (int i = 0; i < a.length; i++) {
    System.out.println("Elemen indeks "+i+" : "+a[i]);
}

}
}
