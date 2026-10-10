import java.util.Scanner;

public class Day39 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Masukkan Angka pertama : ");
int a = sc.nextInt();
System.out.print("Masukkan Operator : ");
char o = sc.next().charAt(0);
System.out.print("Masukkan Angka kedua : ");
int b = sc.nextInt();

int h;

if (o == '+')  {
    h = a+b; System.out.println("Hasil : "+h);
}
else if (o == '-') {
    h = a-b; System.out.println("Hasil : "+h);
}
else if (o == '*') {
    h = a*b; System.out.println("Hasil : "+h);
}
else if (o == '/') {
    if (b != 0){
        h = a/b; System.out.println("Hasil : "+h);
    }
    else {
        System.out.println("Tidak bisa dibagi dengan 0");
    }
}
else {
    System.out.println("Operator tidak valid");
}

sc.close();

}
}
