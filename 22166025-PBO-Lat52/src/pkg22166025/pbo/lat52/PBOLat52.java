/*
Nama      : Nandya M Daffa
Nim       : 22166025
Prodi     : Sistem Informasi
Semester  : 3
Matkul    : PBO
 */
package pkg22166025.pbo.lat52;

/**
 *
 * @author Lenovo
 */
public class PBOLat52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dosen dosen = new Dosen("41227829930", "Rizki Adam Kurniawan", 27, "PBO");
        Mahasiswa mahasiswa = new Mahasiswa("10110269", "Nindi", 17, "PBO2");

        // Menampilkan informasi tentang Dosen
        System.out.println("NIP DOSEN: " + dosen.getNip());
        System.out.println("Saya Dosen");
        System.out.println("Saya " + dosen.getNama() + " umur " + dosen.getUmur() + " tahun sedang mengajar matakuliah " + dosen.getMataKuliah());
        System.out.println();
        
        // Menampilkan informasi tentang Mahasiswa
        System.out.println("NAMA MAHASISWA: " + mahasiswa.getNim());
        System.out.println("Saya Mahasiswa");
        System.out.println("Saya " + mahasiswa.getNama() + " umur " + mahasiswa.getUmur() + " tahun sedang belajar di kelas " + mahasiswa.getKelas());
    }
}
[12.47, 29/11/2023] Daffa: class Dosen {
    private String nip;
    private String nama;
    private int umur;
    private String mataKuliah;

    // Konstruktor
    public Dosen(String nip, String nama, int umur, String mataKuliah) {
        this.nip = nip;
        this.nama = nama;
        this.umur = umur;
        this.mataKuliah = mataKuliah;
    }

    // Metode untuk mendapatkan NIP Dosen
    public String getNip() {
        return nip;
    }

    // Metode untuk mendapatkan nama Dosen
    public String getNama() {
        return nama;
    }

    // Metode untuk mendapatkan umur Dosen
    public int getUmur() {
        return umur;
    }

    // Metode untuk mendapatkan mata kuliah yang diajar Dosen
    public String getMataKuliah() {
        return mataKuliah;
    }
}

class Mahasiswa {
    private String nim;
    private String nama;
    private int umur;
    private String kelas;

    // Konstruktor
    public Mahasiswa(String nim, String nama, int umur, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.umur = umur;
        this.kelas = kelas;
    }

    // Metode untuk mendapatkan NIM Mahasiswa
    public String getNim() {
        return nim;
    }

    // Metode untuk mendapatkan nama Mahasiswa
    public String getNama() {
        return nama;
    }

    // Metode untuk mendapatkan umur Mahasiswa
    public int getUmur() {
        return umur;
    }

    // Metode untuk mendapatkan kelas Mahasiswa
    public String getKelas() {
        return kelas;
    }
}


class Animal {
    private String name;
    private boolean vegetarian;
    private String food;
    private int legs;
    private String color;
    // Konstruktor
    public Animal(String name, boolean vegetarian, String food, int legs, String color) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.food = food;
        this.legs = legs;
        this.color = color;
    }

    // Metode untuk mendapatkan nama hewan
    public String getName() {
        return name;
    }
// Metode untuk menentukan apakah hewan vegetarian
    public boolean isVegetarian() {
        return vegetarian;
    }

    // Metode untuk mendapatkan makanan hewan
    public String getFood() {
        return food;
    }

    // Metode untuk mendapatkan jumlah kaki hewan
    public int getLegs() {
        return legs;
    }

    // Metode untuk mendapatkan warna hewan
    public String getColor() {
        return color;
    }
}
    
