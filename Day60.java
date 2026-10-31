import java.util.Scanner;

public class Day60 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int n = sc.nextInt();
int temp = 0;

for (int a = 1; a <= n; a++) {
    System.out.print(a+" ");
    temp+=a;
}

System.out.println("\nHasil : "+temp);

sc.close();

}
}
