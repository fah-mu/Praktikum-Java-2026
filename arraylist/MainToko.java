
package looping.array.dan.arraylist;

import java.util.Scanner;

public class MainToko {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TokoSerbaAda toko = new TokoSerbaAda();

        System.out.println("TOKO SERBA ADA");
        System.out.println("==============");

        // Tampilkan katalog
        for (Barang b : toko.katalog) {
            b.infoBarang();
        }

        // Input jumlah item
        System.out.print("\nMasukkan jumlah item barang: ");
        int jumlahItem = input.nextInt();

        Barang[] belanjaBarang = new Barang[jumlahItem];
        int[] belanjaJumlah = new int[jumlahItem];

        // Input data transaksi
        for (int i = 0; i < jumlahItem; i++) {
            System.out.println("\nData ke " + (i + 1));

            System.out.print("Masukkan kode: ");
            String kode = input.next();

            Barang barang = toko.cariBarang(kode);

            if (barang == null) {
                System.out.println("Kode barang tidak ditemukan!");
                i--; // ulang input
                continue;
            }

            System.out.print("Masukkan jumlah beli: ");
            int jumlah = input.nextInt();

            belanjaBarang[i] = barang;
            belanjaJumlah[i] = jumlah;
        }

        // Output struk
        System.out.println("\nTOKO SERBA ADA");
        System.out.println("============================================================");
        System.out.println("No  Kode  Nama      Harga   Jumlah   Total");

        int totalBayar = 0;

        for (int i = 0; i < jumlahItem; i++) {
            int total = belanjaBarang[i].getHarga() * belanjaJumlah[i];
            totalBayar += total;

            System.out.println((i + 1) + "   "
                    + belanjaBarang[i].getKode() + "   "
                    + belanjaBarang[i].getNama() + "   "
                    + belanjaBarang[i].getHarga() + "   "
                    + belanjaJumlah[i] + "   "
                    + total);
        }

        System.out.println("============================================================");
        System.out.println("Total Bayar: " + totalBayar);
    }
}
