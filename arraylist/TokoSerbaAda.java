
package looping.array.dan.arraylist;

import java.util.ArrayList;

class TokoSerbaAda {
    ArrayList<Barang> katalog = new ArrayList<>();

    // Constructor isi data awal
    public TokoSerbaAda() {
        katalog.add(new Barang("a001", "Buku", 3000));
        katalog.add(new Barang("a002", "Pensil", 4000));
        katalog.add(new Barang("a003", "Pulpen", 5000));
        katalog.add(new Barang("a004", "Penghapus", 2000));
        katalog.add(new Barang("a005", "Penggaris", 3500));
    }

    // Cari barang berdasarkan kode
    public Barang cariBarang(String kode) {
        for (Barang b : katalog) {
            if (b.getKode().equalsIgnoreCase(kode)) {
                return b;
            }
        }
        return null;
    }
}
