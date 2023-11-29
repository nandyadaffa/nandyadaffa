/*
Nama      : Nandya M Daffa
Nim       : 22166025
Prodi     : Sistem Informasi
Semester  : 3
Matkul    : PBO
 */
package pkg22166025.pbo.lat58;

/**
 *
 * @author Lenovo
 */
public class PBOLat58 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Kalkulator kalkulator = new Kalkulator();

        // Menampilkan hasil perjumlahan
        int hasilJumlah = kalkulator.jumlah(3, 4);
        System.out.println("Hasil perjumlahan = " + hasilJumlah);

        // Menampilkan hasil selisih
        int hasilSelisih = kalkulator.selisih(3, 4);
        System.out.println("Hasil Selisih 3 - 4 = " + hasilSelisih);
    }
}
class Kalkulator {

    // Metode untuk menjumlahkan dua bilangan
    public int jumlah(int a, int b) {
        return a + b;
    }

    // Metode untuk menghitung selisih dua bilangan
    public int selisih(int a, int b) {
        return a - b;
    }
}
    
