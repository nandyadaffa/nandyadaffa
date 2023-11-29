/*
Nama      : Nandya M Daffa
Nim       : 22166025
Prodi     : Sistem Informasi
Semester  : 3
Matkul    : PBO
 */
package pkg22166025.pbo.lat55;

/**
 *
 * @author Lenovo
 */
public class PBOLat55 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Smartphone samsung = new Smartphone("Samsung", "Android", "Android", 3000000, "234ibfd3840fo");
        Smartphone blackberry = new Smartphone("BlackB", "RIM", "Curve", 2000000, "BHS249");
        Smartphone nokia = new Smartphone("Nokia", "Win8", "Lumia", 1000000, "UUUQIJWORJ");

        // Menampilkan informasi setiap smartphone
        samsung.displayInfo();
        blackberry.displayInfo();
        nokia.displayInfo();
    }
}
class Smartphone {
    private String manufaktur;
    private String os;
    private String model;
    private int harga;
    private String kunci;
// Konstruktor
    public Smartphone(String manufaktur, String os, String model, int harga, String kunci) {
        this.manufaktur = manufaktur;
        this.os = os;
        this.model = model;
        this.harga = harga;
        this.kunci = kunci;
    }

    // Metode untuk menampilkan informasi smartphone
    public void displayInfo() {
        System.out.println("Manufaktur: " + manufaktur);
        System.out.println("Model: " + model);
        System.out.println("Harga: " + harga);
        

    }
}

    
