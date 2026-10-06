import java.util.Scanner;

public class Day35 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Masukkan Nilai : ");
int a = sc.nextInt();

if (a>=0) {
    if (a>=70) {
        System.out.println("Anda Dinyatakan Lulus");
    }
    else {
        System.out.println("Mohon Maaf Anda Dinyatakan Tidak Lulus");
    }
}
else{
    System.out.println("Nilai Tidak Valid");
}


sc.close();


}
}
