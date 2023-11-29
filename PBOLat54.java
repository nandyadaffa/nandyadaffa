/*
Nama      : Nandya M Daffa
Nim       : 22166025
Prodi     : Sistem Informasi
Semester  : 3
Matkul    : PBO
 */
package pkg22166025.pbo.lat54;

/**
 *
 * @author Lenovo
 */
public class PBOLat54 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Koordinat koordinat = new Koordinat("Jingga", 10, 4);

        // Menampilkan informasi koordinat
        koordinat.displayInfo();
    }
}

class Koordinat {
    private String warna;
    private int x;
    private int y;

    // Konstruktor
    public Koordinat(String warna, int x, int y) {
        this.warna = warna;
        this.x = x;
        this.y = y;
    }

    // Metode untuk menampilkan informasi koordinat
    public void displayInfo() {
        System.out.println("Warna koordinat: " + warna);
        System.out.println("Koordinat Sumbu x: " + x + ", y: " + y);
    }
}
    