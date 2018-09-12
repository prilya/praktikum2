import java.util.Scanner;

public class LuasSegitiga1 {

    public static void main(String[] args) {
        int alas, tinggi;

        Scanner input = new Scanner(System.in);
        System.out.println("\n== Program Menghitung Luas Segitiga ==");
        System.out.println("\nMasukkan Alas\t :");
        alas = input.nextInt();
        System.out.println("Masukkan Tinggi\t :");
        tinggi = input.nextInt();
        float luas = ((alas*tinggi)/2F);
        System.out.println("Luas Segitiga adalah = " + luas);
    }
}