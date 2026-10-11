import java.util.Scanner;

public class Day40 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int paket = sc.nextInt();
int pulsa = sc.nextInt();


int sisa = 0;


if (paket == 1) {
    if (pulsa >= 10000) {
        System.out.println("Paket : Harian 3GB");
        System.out.println("Status : Berhasil");
        System.out.println("Sisa Pulsa : Rp"+(sisa = pulsa - 10000));
    }
    else {
        System.out.println("Paket : Harian 3GB");
        System.out.println("Status : Pulsa tidak cukup");
        System.out.println("Kekurangan : Rp"+(sisa = 10000 - pulsa));
    }
}
else if (paket == 2) {
    if (pulsa >= 35000) {
        System.out.println("Paket : Mingguan 15GB");
        System.out.println("Status : Berhasil");
        System.out.println("Sisa Pulsa : Rp"+(sisa = pulsa - 35000));
    }
    else {
        System.out.println("Paket : Mingguan 15GB");
        System.out.println("Status : Pulsa tidak cukup");
        System.out.println("Kekurangan : Rp"+(sisa = 35000 - pulsa));
    }
}
else if  (paket == 3) {
    if (pulsa >= 90000) {
        System.out.println("Paket : Bulanan 50GB");
        System.out.println("Status : Berhasil");
        System.out.println("Sisa Pulsa : Rp"+(sisa = pulsa - 90000));
    }
    else {
        System.out.println("Paket : Bulanan 50GB");
        System.out.println("Status : Pulsa tidal cukup");
        System.out.println("Kekurangan : Rp"+(sisa = 90000 - pulsa));
    }
}
else {
    System.out.println("Pilihan tidak valid");
}

sc.close();

}
}
