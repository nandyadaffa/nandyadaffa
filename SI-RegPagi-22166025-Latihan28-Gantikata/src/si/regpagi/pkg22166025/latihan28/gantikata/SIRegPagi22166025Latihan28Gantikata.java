/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si.regpagi.pkg22166025.latihan28.gantikata;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class SIRegPagi22166025Latihan28Gantikata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("====Program Mengganti Kata====");
            System.out.print("Masukkan Kalimat: ");
            String kalimat = input.nextLine();
            System.out.print("Ganti Kata: ");
            String kataGanti = input.nextLine();
            System.out.print("Menjadi Kata: ");
            String kataBaru = input.nextLine();
            
            // hasil formatting
            System.out.println("====Hasil Formatting====");
            System.out.println("Kalimat awal: ");
            System.out.println(kalimat);
            System.out.println("Kalimat baru:");
            String kalimatBaru = kalimat.replaceAll(kataGanti, kataBaru);
            System.out.println(kalimatBaru);
        }
    }
    }
    

