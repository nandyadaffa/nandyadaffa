/*
Nama      : Nandya M Daffa
Nim       : 22166025
Prodi     : Sistem Informasi
Semester  : 3
Matkul    : PBO
 */
package pkg22166025.pbo.lat56;

/**
 *
 * @author Lenovo
 */
public class PBOLat56 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BarangAntik radioAm = new BarangAntik("Radio AM", 234);

        // Menampilkan informasi barang antik
        radioAm.displayInfo();
    }
}

class BarangAntik {
    private String nama;
    private int umur;

    // Konstruktor
    public BarangAntik(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Metode untuk menampilkan informasi barang antik
    public void displayInfo() {
        System.out.println("Nama barang Antik: " + nama);
        System.out.println("Umur barang antik ini adalah: " + umur + " tahun");
    }
}