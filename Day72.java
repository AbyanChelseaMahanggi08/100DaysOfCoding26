import java.util.Scanner;

public class Day72 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int a;
int total = 0;

while (true) { 
    a = sc.nextInt();

    if (a < 0) {
        break;
    }

    total += a;

}

System.out.println("Hasil : "+total);

sc.close();

}
}
