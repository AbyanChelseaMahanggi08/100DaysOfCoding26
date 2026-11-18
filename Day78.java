import java.util.Scanner;

public class Day78 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("=== MEMBUAT AKUN ===");
System.out.print("Buat Username : ");
String usn = sc.nextLine();
System.out.print("Buat Password : ");
String pw = sc.nextLine();

String usnLog;
String pwLog;

do {
    System.out.println("\n=== LOGIN KE AKUN ===");
    System.out.print("Masukkan Username : ");
    usnLog = sc.nextLine();
    System.out.print("Masukkan Password : ");
    pwLog = sc.nextLine();
    
    if (usn.equals(usnLog) && pw.equals(pwLog)) {
        System.out.println("\n=== Login Berhasil ===");
        break;
    }
    else {
        System.out.println("Username Atau Password Tidak Valid");
    }
} while (true); 



}
}
