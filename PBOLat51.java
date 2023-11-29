/*
Nama      : Nandya M Daffa
Nim       : 22166025
Prodi     : Sistem Informasi
Semester  : 3
Matkul    : PBO
 */
package pkg22166025.pbo.lat51;

import java.util.Scanner;

// Employee class
class Employee {
    private String nik;
    private String nama;
    private String jabatan;
    private int golongan;

    // Constructor
    public Employee(String nik, String nama, String jabatan, int golongan) {
        this.nik = nik;
        this.nama = nama;
        this.jabatan = jabatan;
        this.golongan = golongan;
    }

    // Getter and setter methods
    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public int getGolongan() {
        return golongan;
    }

    public void setGolongan(int golongan) {
        this.golongan = golongan;
    }
}

// Manager class (extends Employee)
class Manager extends Employee {
    private int kehadiran;

    // Constructor
    public Manager(String nik, String nama, String jabatan, int golongan, int kehadiran) {
        super(nik, nama, jabatan, golongan);
        this.kehadiran = kehadiran;
        // Calculate other attributes based on your business logic
        // tunjanganGolongan, tunjanganJabatan, tunjanganKehadiran, etc.
    }

    // Getter and setter methods for Manager-specific attributes

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }

    public float tunjanganKehadiran() {
        // Calculate tunjanganKehadiran based on your business logic
        return 0.0f;
    }

    public float tunjanganJabatan() {
        // Calculate tunjanganJabatan based on your business logic
        return 0.0f;
    }

    public float tunjanganGolongan() {
        // Calculate tunjanganGolongan based on your business logic
        return 0.0f;
    }

    public float gajiTotal() {
        // Calculate gajiTotal based on your business logic
        return 0.0f;
    }
}

public class PBOLat51 {
    public static void main(String[] args) {
        // Kode untuk input dan pemanggilan class dapat ditambahkan di sini
        Scanner scanner = new Scanner(System.in);
        
        // Contoh penggunaan Manager
        System.out.print("Masukkan NIK Manager: ");
        String nikManager = scanner.next();
        System.out.print("Masukkan Nama Manager: ");  
        String namaManager = scanner.next();
        System.out.print("Masukkan Jabatan Manager: ");
        String jabatanManager = scanner.next();
        System.out.print("Masukkan Golongan Manager: ");
        int golonganManager = scanner.nextInt();
        System.out.print("Masukkan Kehadiran Manager: ");
        int kehadiranManager = scanner.nextInt();
        
        Manager manager = new Manager(nikManager, namaManager, jabatanManager, golonganManager, kehadiranManager);
        
        // Lakukan sesuatu dengan objek manager, misalnya mencetak informasi atau menghitung gaji total
        System.out.println("Informasi Manager:");
        System.out.println("NIK: " + manager.getNik());
        System.out.println("Nama: " + manager.getNama());
        System.out.println("Jabatan: " + manager.getJabatan());
        System.out.println("Golongan: " + manager.getGolongan());
        System.out.println("Kehadiran: " + manager.getKehadiran());
        System.out.println("Gaji Total: " + manager.gajiTotal());
    }
}
