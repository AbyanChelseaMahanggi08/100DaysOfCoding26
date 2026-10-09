import java.util.Scanner;

public class Day38 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("======== Menu Warung ========");
System.out.println("1.Nasi kuning Rp10.000");
System.out.println("2.Nasi uduk Rp15.000");
System.out.println("3.Nasi padang Rp20.000");
System.out.println("4.Nasi goreng Rp15.000");
System.out.println("=============================");
System.out.print("\n\nPilih menu yang ingin anda pesan : ");
int a = sc.nextInt();

if (a == 1) {
    System.out.println("\nAnda memesan Nasi kuning\nTotal tagihan : Rp10.000");
}
else if (a == 2) {
    System.out.println("\nAnda memesan Nasi uduk\nTotal tagihan : Rp15.000");
}
else if (a == 3) {
    System.out.println("\nAnda memesan Nasi padang\nTotal tagihan : Rp20.000");
}
else if (a == 4) {
    System.out.println("\nAnda memesan Nasi goreng\nTotal tagihan : Rp15.000");
}
else{
    System.out.println("Tidak tersedia pada bagian menu");
}

sc.close();

}
}
