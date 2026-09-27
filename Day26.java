
import java.util.Scanner;
public class Day26{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);


// Soal 1
System.out.print("Masukkan Nama\t\t: ");
 String nama = sc.nextLine();
System.out.print("Masukkan NIM\t\t: ");
 String nim = sc.nextLine();
System.out.print("Masukkan Kelas\t\t: ");
 char kelas = sc.next().charAt(0);
System.out.print("Masukkan Umur\t\t: ");
 int umur = sc.nextInt();
System.out.print("Masukkan Prodi\t\t: ");
 sc.nextLine();
 String e = sc.nextLine();
System.out.print("Masukkan IPK\t\t: ");
 double f = sc.nextDouble(); 
System.out.print("Status Keaktifan\t: ");
 boolean g = sc.nextBoolean();

System.out.println("==== BIODATA MAHASISWA ====");
System.out.println("Nama\t\t: "+nama);
System.out.println("NIM\t\t: "+nim);
System.out.println("Kelas\t\t: "+kelas);
System.out.println("Umur\t\t: "+umur+" Tahun");
System.out.println("Prodi\t\t: "+e);
System.out.printf("IPK\t\t: %.2f",f);
System.out.println("\nStatus Aktif\t: "+g);
System.out.println("===========================");




// Soal 2
System.out.println("\n\n");
int z = sc.nextInt();
int q = sc.nextInt();
double pi = 3.14;

double hasil  = pi*z*z;
double hasil1 = pi*q*q;

System.out.println(hasil);
System.out.println(hasil1);




// Soal 3
System.out.println("\n\n");
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
int d = sc.nextInt();

a = a+b;
b = a-b;
a = a-b;

c = c+d;
d = c-d;
c = c-d;

System.out.println("\n"+a);
System.out.println(b);
System.out.println(c);
System.out.println(d);


sc.close();


}
}
