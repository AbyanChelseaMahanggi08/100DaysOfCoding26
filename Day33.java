
import java.util.Scanner;

public class Day33 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Masukkan umur : ");
int a = sc.nextInt();

if (a>=17) {
    System.out.println("Selamat Anda Bisa Memiliki KTP");
}
else {
    System.out.println("Mohon Maaf Anda Blum Bisa Memiliki KTP");
}

sc.close();

}    
}
