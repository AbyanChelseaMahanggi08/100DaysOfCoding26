import java.util.Scanner;

public class Day34 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Masukkan Nilai : ");
int nilai = sc.nextInt();

if (nilai>=90) {
    System.out.println("Selamat Anda Mendapatkan Grade A");
}
else if (nilai>=80) {
    System.out.println("Selamat Anda Mendapatkan Grade B");
}
else if (nilai>=70) {
    System.out.println("Selamat Anda Mendapatkan Grade C");
}
else {
    System.out.println("Mohon Maaf Nilai Anda Error");
}


sc.close();


}
}
