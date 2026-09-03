// Program Biodata Diri
 
public class Day2 {

    public static void main(String[] args) {

        // Menampilkan judul menggunakan println()
        System.out.println("======= BIODATA DIRI =======");

        /*
         * print() digunakan untuk membuat format nama.
         * println() digunakan untuk mengisi format nama.
         */
        System.out.print("Nama          : ");
        System.out.println("Abyan Chelsea Mahanggi");

        /*
         * printf() digunakan untuk menampilkan
         * umur dengan format tertentu.
         */
        int umur = 18;
        System.out.printf("Umur          : %d tahun%n", umur);


        // Menampilkan tempat dan tanggal lahir
        System.out.print("Tempat Lahir  : ");
        System.out.println("Makassar");

        /*
         * printf() digunakan untuk menampilkan
         * tanggal lahir dengan format tertentu.
         */
        String tanggalLahir = "08 Juni 2008";
        System.out.printf("Tanggal Lahir : %s%n", tanggalLahir);

        // Digunakan menampilkan jenis kelamin
        System.out.println("Jenis Kelamin : Laki-laki");

        // Digunakan untuk menampilkan alamat
        System.out.println("Alamat        : Limboro");

    
    }
}
