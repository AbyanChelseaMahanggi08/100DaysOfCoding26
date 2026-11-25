public class Day85 {
public static void main(String[] args) {

int[] nilai = {85, 70, 80, 95, 90};
int kecil = nilai[0];

for (int i = 0; i < nilai.length; i++) {
if (nilai[i] <= kecil) {
kecil = nilai[i];
}
}

System.out.println("Nilai Terkecil : " + kecil);

}
}
