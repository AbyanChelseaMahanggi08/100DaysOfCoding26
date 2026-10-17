import java.util.Scanner;

public class Day46 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("===== Menu =====");
System.out.println("1.Jus Alpukat");
System.out.println("2.Jus Apel");
System.out.println("3.Jus Mangga");

System.out.print("Masukkan no menu yang ingin anda pesan : ");
int menu = sc.nextInt();

switch (menu) {
    case 1 :
    System.out.println("Anda memesan Jus Alpukat");
    break;
    case 2 :
    System.out.println("Anda memesan Jus Apel");
    break;
    case 3 :
    System.out.println("Anda memesan Jus Mangga");
    break;
    default :
    System.out.println("Menu yang anda pesan tidak valid");
}

sc.close();

}    
}
