/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si.regpagi.pkg22166025.latihan21.programrataratanilai;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 * Nama : Nandya M Daffa
 * Kelas : PBO1 Reg Pagi
 * NIM : 22166025
 * Deskripsi Program : Program Rata-rata Nilai
 */
public class SIRegPagi22166025Latihan21ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input banyaknya mahasiswa
        System.out.print("Masukkan banyaknya mahasiswa: ");
        int banyakMahasiswa = input.nextInt();

        // Inisialisasi array nilai mahasiswa
        double[] nilaiMahasiswa = new double[banyakMahasiswa];

        // Input nilai mahasiswa
        for (int i = 0; i < banyakMahasiswa; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = input.nextDouble();
        }
         // Hitung rata-rata nilai mahasiswa
        double rataRata = 0.0;
        for (int i = 0; i < banyakMahasiswa; i++) {
            rataRata += nilaiMahasiswa[i];
        }
        rataRata /= banyakMahasiswa;

        // Cetak rata-rata nilai mahasiswa
        System.out.println("Rata-rata nilai mahasiswa: " + rataRata);
    }
    }
    
