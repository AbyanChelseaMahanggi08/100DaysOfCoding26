import java.util.Scanner;

public class Day80 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Masukkan Jumlah Elemen : ");
int a = sc.nextInt();
int[] nilai = new int[a];

for (int i = 0; i < nilai.length; i++){
    System.out.print("Masukkan Nilai Ke-"+i+" : ");
    nilai[i] = sc.nextInt();
}

System.out.print("Masukkan Indeks yang ingin di akses : ");
int indeks = sc.nextInt();

if (indeks >= 0 && indeks < nilai.length) {
    System.out.println("Nilai pada indeks "+indeks+" adalah : "+nilai[indeks]);
}
else {
    System.out.println("Indeks tidak tersedia");
}


}
}
