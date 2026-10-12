import java.util.Scanner;

public class Day41 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Suhu : ");
double suhu = sc.nextDouble();

if (suhu < 0){
    System.out.println("Sangat dingin");
}
else if (suhu >= 0 && suhu <= 10) {
    System.out.println("Dingin");
}
else if (suhu > 10 && suhu <= 20) {
    System.out.println("Sejuk");
}
else if (suhu > 20 && suhu <= 30){
    System.out.println("Hangat");
}
else if (suhu > 30 && suhu <= 40){
    System.out.println("Panas");
}
else {
    System.out.println("Sangat panas");
}


sc.close();

}
}
