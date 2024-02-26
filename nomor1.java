/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugaspbopert3;

/**
 *
 * @author sahru
 */
import java.util.Scanner;

public class nomor1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca nilai a, b, dan c dari user
        System.out.print("Masukkan nilai a: ");
        int a = scanner.nextInt();
        System.out.print("Masukkan nilai b: ");
        int b = scanner.nextInt();
        System.out.print("Masukkan nilai c: ");
        int c = scanner.nextInt();

        // Memeriksa apakah a, b, dan c adalah ribuan
        boolean isRibuanA = a >= 1000 && a < 99999;
        boolean isRibuanB = b >= 1000 && b < 99999;
        boolean isRibuanC = c >= 1000 && c < 99999;

        // Menampilkan hasil
        if (isRibuanA && isRibuanB && isRibuanC) {
            System.out.println("Ketiga nilai adalah ribuan");
        } else if (isRibuanA && isRibuanB) {
            System.out.println("Nilai a dan b adalah ribuan");
        } else if (isRibuanA && isRibuanC) {
            System.out.println("Nilai a dan c adalah ribuan");
        } else if (isRibuanB && isRibuanC) {
            System.out.println("Nilai b dan c adalah ribuan");
        } else if (isRibuanA) {
            System.out.println("Nilai a adalah ribuan");
        } else if (isRibuanB) {
            System.out.println("Nilai b adalah ribuan");
        } else if (isRibuanC) {
            System.out.println("Nilai c adalah ribuan");
        } else {
            System.out.println("Tidak ada nilai yang ribuan");
        }
    }
}
