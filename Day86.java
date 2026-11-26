import java.util.Scanner;

public class Day86 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int[] angka = {10,20,30,40,50};

System.out.print("Masukkan Angka yang ingin dicari : ");
int cari = sc.nextInt();

boolean ditemukan = false;

for (int i = 0; i < angka.length; i++){
    if (angka[i] == cari){
    System.out.println("Angka yang anda cari : "+cari);
    System.out.println("Berada pada indeks   : "+i);
    ditemukan = true;
    break;
    }
}

if (!ditemukan){
    System.out.println("Angka yang anda cari tidak ditemukan");
}

sc.close();

}
}
