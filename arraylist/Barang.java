
package looping.array.dan.arraylist;


class Barang {
    private String kode;
    private String nama;
    private int harga;

    // Constructor
    public Barang(String kode, String nama, int harga) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
    }

    // Getter (dibutuhkan nanti)
    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    // Method info
    public void infoBarang() {
        System.out.println(kode + " | " + nama + " | " + harga);
    }
}