import java.util.Scanner;

public class Day54 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int a = sc.nextInt();
int b;

for (b = 1; b <= a; b++) {
    if ((b % 3 == 0) != (b % 4 == 0)) {
        System.out.println(b);
    } 
}

sc.close();

}
}
