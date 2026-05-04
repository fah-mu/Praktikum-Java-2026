
package input.dan.percabangan;


import java.util.Scanner;

public class KasirToko {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Masukkan nama pelanggan : ");
        String nama = input.nextLine();

        System.out.print("Total harga belanja : ");
        double totalBelanja = input.nextDouble();

        // Menu kategori
        System.out.println("\nPilih kategori member:");
        System.out.println("1. Regular (0%)");
        System.out.println("2. Silver (10%)");
        System.out.println("3. Gold (20%)");
        System.out.println("4. Platinum (30%)");
        System.out.print("Pilihan: ");
        int pilihan = input.nextInt();

        double diskonPersen;
        String kategori;

        // Switch-case
        switch (pilihan) {
            case 1:
                kategori = "Regular";
                diskonPersen = 0.0;
                break;
            case 2:
                kategori = "Silver";
                diskonPersen = 0.10;
                break;
            case 3:
                kategori = "Gold";
                diskonPersen = 0.20;
                break;
            case 4:
                kategori = "Platinum";
                diskonPersen = 0.30;
                break;
            default:
                kategori = "Tidak dikenal";
                diskonPersen = 0.0;
                System.out.println("Kategori tidak dikenal, diskon tidak diterapkan");
        }

        // Hitung diskon
        double diskon = totalBelanja * diskonPersen;
        double totalBayar = totalBelanja - diskon;

        // Menentukan metode pembayaran
        String metode;
        if (totalBayar < 50000) {
            metode = "Tunai";
        } else if (totalBayar < 200000) {
            metode = "Tunai / Transfer";
        } else {
            metode = "Tunai / Transfer / Kartu Kredit";
        }

        // Output struk
        System.out.println("\n========== STRUK PEMBAYARAN ==========");
        System.out.println("Nama Pelanggan : " + nama);
        System.out.println("Kategori Member : " + kategori);
        System.out.println("Total Belanja : Rp " + totalBelanja);
        System.out.println("Diskon (" + (diskonPersen * 100) + "%) : Rp " + diskon);
        System.out.println("Total Bayar : Rp " + totalBayar);
        System.out.println("--------------------------------------");
        System.out.println("Metode Pembayaran: " + metode);
        System.out.println("======================================");
    }
}