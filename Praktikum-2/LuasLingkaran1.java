import java.util.Scanner;

public class LuasLingkaran1 {

    public static void main(String[] args) {
        float phi = 3.14F;
        float luas;
        int r;

        Scanner input = new Scanner(System.in);

        System.out.println("\n== Program Menghitung Luas Lingkaran ==");
        System.out.println("Masukkan Panjang jari-jari : ");
        r=input.nextInt();

        luas = .5F*phi*r*r;
        System.out.println("maka Luas lingkaran adalah = " + luas);
    }
}