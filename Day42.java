
import java.util.Scanner;

public class Day42 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Masukkan Gaji Karyawan : ");
double gaji = sc.nextDouble();

double potongan;
double gajiBersih;

if (gaji >= 4500000) {
    potongan = gaji * 0.10;
}
else {
    potongan =  gaji * 0.05;
}

gajiBersih = gaji-potongan;
System.out.printf("Gaji Bersih : %.0f",gajiBersih);

sc.close();

}
}
