import java.util.Scanner;

public class Day73 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int n = 1;
int pilihan;

do {
    System.out.println("=== Menu Jus ===");
    System.out.println("1. Jus Alpukat");
    System.out.println("2. Jus Jeruk");
    System.out.println("3. Jus Apel");
    System.out.println("Note : Input 0 untuk Mengakhiri pesanan");
    System.out.println();
    System.out.print("Pilih Menu 1-3 : ");
    pilihan = sc.nextInt();

    if (pilihan == 1) {
        System.out.println("\nanda memesan Jus alpukat\n");
    }
    else if (pilihan == 2) {
        System.out.println("\nanda memesan Jus jeruk\n");
    }
    else if (pilihan == 3) {
        System.out.println("\nanda memesan Jus apel\n");
    }
    else if (pilihan == 0) {
        System.out.println();
    }
    else {
        System.out.println("\nPesanan tidak tersedia");
        return;
    }
    n++;
}
while (pilihan != 0);
    System.out.println("Anda Mengakhiri Pesanan");

sc.close();

}
}
