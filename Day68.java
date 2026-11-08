import java.util.Scanner;

public class Day68 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

// Soal 2
int pilihan = sc.nextInt();
int n = sc.nextInt();
sc.nextLine();
String a = sc.nextLine();

System.out.println();
if (pilihan < 1 || pilihan > 3) {
    System.out.println("Pilihan tidak valid");
    return;
}

if (n < 1) {
    System.out.println("Ukuran tidak valid");
    return;
}

if (pilihan == 1) {
    for (int i = 1; i <= n; i++) {
        System.out.println(a);
    }
}

if (pilihan == 2) {
    for (int i = 1; i <= n; i++) {
        System.out.print(a + " ");
    }
}

if (pilihan == 3) {
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
            System.out.println(a + " ");
        }
        System.out.println();
    }
}

System.out.println();
System.out.println();

// Soal 3

int b = sc.nextInt();

for (int i = 1; i <= b; i++) {
    for (int j = 1; j <= b; j++) {
        if (i == b || j == 1 || j == i) {
            System.out.print("* ");
        }
        else {
            System.out.print("  ");
        }
    }
    System.out.println();
}

sc.close();

}
}
