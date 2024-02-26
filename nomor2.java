/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbopert3;

/**
 *
 * @author sahru
 */
import java.util.Scanner;

public class nomor2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca nilai a, b, dan c dari user
        System.out.print("Masukkan nilai a: ");
        int a = scanner.nextInt();
        System.out.print("Masukkan nilai b: ");
        int b = scanner.nextInt();
        System.out.print("Masukkan nilai c: ");
        int c = scanner.nextInt();

        // Mencari nilai terbesar
        int terbesar = a;
        if (b > terbesar) {
            terbesar = b;
        }
        if (c > terbesar) {
            terbesar = c;
        }

        // Menampilkan hasil
        System.out.println("Nilai terbesar adalah: " + terbesar);
    }
}
