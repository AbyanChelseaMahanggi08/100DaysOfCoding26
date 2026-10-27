
import java.util.Scanner;

public class Day56 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int n = sc.nextInt();

for (int b = 1; b <= n; b++) {
    System.out.print(b+" ");
}

System.out.println("");

for (int b = n; b >= 1; b--) {
    System.out.print(b+" ");
}

sc.nextInt();

}
}
