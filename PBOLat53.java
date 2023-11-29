/*
Nama      : Nandya M Daffa
Nim       : 22166025
Prodi     : Sistem Informasi
Semester  : 3
Matkul    : PBO
 */
package pkg22166025.pbo.lat53;

/**
 *
 * @author Lenovo
 */
public class PBOLat53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Animal peter = new Animal("Peter", false, "grass", 4, "grey");

        // Menampilkan informasi tentang Peter
        System.out.println("Hello, His name is " + peter.getName());
        System.out.println(peter.getName() + " is Vegetarian? " + peter.isVegetarian());
        System.out.println(peter.getName() + " eats " + peter.getFood());
        System.out.println(peter.getName() + " has " + peter.getLegs() + " legs.");
        System.out.println(peter.getName() + " color is " + peter.getColor());
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