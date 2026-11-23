
import java.util.Scanner;

public class Day83 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int[] nilai = new int [3];
int total = 0;

for (int i = 0; i < nilai.length; i++) {
    System.out.print("Input Nilai "+(i+1)+" : ");
    nilai[i] = sc.nextInt();
}

System.out.println();

for (int i = 0; i < nilai.length; i++) {
    total += nilai[i];
}
System.out.println("Total Pemjumlahan : "+total);


}
}
