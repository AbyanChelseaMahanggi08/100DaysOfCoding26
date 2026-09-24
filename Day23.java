
import java.util.Scanner;

public class Day23 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Masukkan sisi persegi : ");
int sisi = sc.nextInt();

int luas = sisi * sisi;

System.out.println("\n======= HASIL =======");
System.out.println("Luas persegi = " + luas);


sc.close();
    
} 
}
