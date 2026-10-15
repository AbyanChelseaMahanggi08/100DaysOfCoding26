
import java.util.Scanner;

public class Day44 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Masukkan Nilai : ");
int nilai = sc.nextInt();

if (nilai >= 85 && nilai <= 100 ) {
    System.out.println("Predikat A");
}
else if (nilai >= 75 && nilai <= 100) {
    System.out.println("Predikat B");
}
else if (nilai >= 60 && nilai <= 100) {
    System.out.println("Predikat C");
}
else if (nilai >= 40 && nilai <= 100) {
    System.out.println("Predikat D");
}
else if (nilai >= 0 && nilai <= 100) {
    System.out.println("Predikat E");
}
else {
    System.out.println("Nilai tidak valid");
}

sc.close();

}
}
