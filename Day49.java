import java.util.Scanner;

public class Day49 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Masukkan Umur : ");
int umur = sc.nextInt();

String a = (umur>=17) ? "Ya" : "Tidak";

System.out.println("Apakah umur memenuhi syarat untuk membuat KTP ? : "+a);

sc.close();

}
}
