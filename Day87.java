import java.util.Scanner;

public class Day87 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int[] nilai = {10,20,30,40,50};

for (int i = 0; i < nilai.length; i++){
    System.out.println("Indeks "+i+" : "+nilai[i]);
}

System.out.print("Masukkan indeks yang ingin diubah : ");
int indeks = sc.nextInt();

if (indeks >= 0 && indeks <= nilai.length){
    System.out.print("Masukkan Nilai baru : ");
    int nilaiBaru = sc.nextInt();

    nilai[indeks] = nilaiBaru;

    System.out.println("\nData berhasil diubah");

    for (int i = 0; i < nilai.length; i++){
        System.out.println("Indeks "+i+" : "+nilai[i]);
    }
}
else {
    System.out.println("Indeks tidak valid");
}

}
}
