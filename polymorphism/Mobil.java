
package polymorphism;


class Mobil extends Kendaraan {
    private int jumlahPintu;

    // Constructor
    public Mobil(String merk, int kecepatanMaksimal, int jumlahPintu) {
        super(merk, kecepatanMaksimal);
        this.jumlahPintu = jumlahPintu;
    }

    // Override gerakkan()
    @Override
    public void gerakkan() {
        System.out.println("Mobil " + merk + " melaju di jalan raya!");
    }

    // Override infoKendaraan()
    @Override
    public void infoKendaraan() {
        super.infoKendaraan();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}