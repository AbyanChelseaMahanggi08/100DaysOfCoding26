public class Day55 {

    static int cekAngka(int angka) {
        return angka;
    }
public static void main(String[] args) {

int a;

for (a = 1; a <= 10; a++) {

    if (a == 2) {
        continue;
    }

    if (a == 6) {
        break;
    }

    int hasil = cekAngka(a);
    System.out.println(hasil);
}

}    
}
