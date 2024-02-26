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

public class nomor3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca nilai jam masuk dan jam keluar dari user
        System.out.print("Masukkan jam masuk: ");
        int jamMasuk = scanner.nextInt();
        System.out.print("Masukkan jam keluar: ");
        int jamKeluar = scanner.nextInt();

        // Menghitung lama parkir
        int lamaParkir = 0;
        if (jamKeluar >= jamMasuk) {
            lamaParkir = jamKeluar - jamMasuk;
        } else {
            lamaParkir = jamKeluar + 24 - jamMasuk;
        }

        // Menghitung biaya parkir
        int biayaParkir = 1500;
        if (lamaParkir > 2) {
            biayaParkir += (lamaParkir - 2) * 1000;
        }

        // Menampilkan hasil
        System.out.println("Lama parkir: " + lamaParkir + " jam");
        System.out.println("Biaya parkir: Rp" + biayaParkir);
    }
}
