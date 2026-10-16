import java.util.Scanner;

public class Day45 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("Lampu Lalu Lintas");
System.out.println("hijau");
System.out.println("kuning");
System.out.println("merah");
System.out.print("Masukkan warna lampu lalu lintas : ");
String warna = sc.nextLine();

switch (warna) {
    case "hijau" :
    System.out.println("Silakan Jalan");
    break;
    case "kuning" :
    System.out.println("Hati-Hati");
    break;
    case "merah" :
    System.out.println("Berhenti");
    break;
    default:
    System.out.println("Warna lampu lalu lintas tidak valid");
    break;
}

sc.close();

}
}
