public class Day84 {
public static void main(String[] args) {
    
int[] nilai = {85,70,80,95,90};
int besar = nilai[0];

for (int i = 0; i < nilai.length; i++){
    if (nilai[i] >= besar) {
        besar = nilai[i]; 
    }
} 

System.out.println("Nilai Tertinggi : "+besar);

}
}
