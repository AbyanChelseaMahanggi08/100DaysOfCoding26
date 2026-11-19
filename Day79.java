import java.util.Scanner;

public class Day79 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int[] nilai = new int[5]; 

for (int a = 0; a < nilai.length; a++) {
    nilai[a] = sc.nextInt();
}

System.out.println("Daftar Nilai : ");

for (int a = 0; a < nilai.length; a++) {
    System.out.println("Indeks"+a+" : "+nilai[a]);
}

}
}
