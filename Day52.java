
import java.util.Scanner;

public class Day52 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Masukkkan Angka : ");
int batas = sc.nextInt();
int a = 1;

while (a<=batas) {
    System.out.println(+a);
    a++;
}

sc.close();

}
}
