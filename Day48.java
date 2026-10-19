import java.util.Scanner;

public class Day48 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Masukkan angka 1  : ");
int a = sc.nextInt();
System.out.print("Masukkan Operator : ");
int operator = sc.next().charAt(0);
System.out.print("Masukkan angka 2  : ");
int b = sc.nextInt();

switch (operator) {
    case '+':
    System.out.println(a+b);
    break;
    case '-':
    System.out.println(a-b);
    break;
    case '*' :
    System.out.println(a*b);
    break;
    case '/' :
    if (b != 0) {
        System.out.println(a/b);
    }
    else {
        System.out.println("tidak bisa dibagi 0");
    }
    break;
    case '%' :
    if (b != 0) {
        System.out.println(a%b);
    }
    else {
        System.out.println("tidak bisa mencari sisa bagi dengan 0");
    }
    break;
    default:
    System.out.println("Operator tidak valid");
    break;

}

sc.close();

}
}
