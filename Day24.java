import java.util.Scanner;

public class Day24{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Masukkan Panjang : ");
int panjang = sc.nextInt();
System.out.print("Masukkan Lebar   : ");
int lebar = sc.nextInt();

int luas = panjang*lebar;

System.out.println("\n======= HASIL =======");
System.out.println("Luas persegi panjang : " + luas);


sc.close();

}
}
