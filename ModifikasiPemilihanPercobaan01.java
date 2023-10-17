import java.util.Scanner;
public class ModifikasiPemilihanPercobaan101 {
    public static void main(String [] args) {
        Scanner input01 = new Scanner(System.in);

        System.out.print("Masukan angka: ");
        int angka = input01.nextInt();

        String hasil = (angka % 2 == 0) ? "Angka" + angka + " termasuk bilangan genap " : " Angka " + angka + " termasuk bilangan ganjil ";
        System.out.println(hasil);
    
    }
}