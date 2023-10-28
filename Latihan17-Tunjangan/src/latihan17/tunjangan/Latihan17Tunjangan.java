/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan17.tunjangan;

/**
 *
 * @author Lenovo
 */
public class Latihan17Tunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan gaji pokok Younglex: Rp ");
        double gajiPokok = input.nextDouble();
        
        System.out.print("Apakah Younglex sudah menikah? (ya/tidak): ");
        String statusPernikahan = input.next();
        
         double tunjangan = 0;
        
        if (statusPernikahan.equalsIgnoreCase("ya")) {
            // Menghitung tunjangan 35% dari gaji pokok jika sudah menikah
            tunjangan = 0.35 * gajiPokok;
        }
        
        double totalGaji = gajiPokok + tunjangan;
        
        System.out.println("Total gaji Younglex: Rp " + totalGaji);
        System.out.println("Total tunjangan Younglex: Rp " + tunjangan);
    }
}
 
