
package polymorphism;

abstract class Kendaraan {
    protected String merk;
    protected int kecepatanMaksimal;

    // Constructor
    public Kendaraan(String merk, int kecepatanMaksimal) {
        this.merk = merk;
        this.kecepatanMaksimal = kecepatanMaksimal;
    }

    // Abstract method
    public abstract void gerakkan();

    // Method info
    public void infoKendaraan() {
        System.out.println("Merk: " + merk);
        System.out.println("Kecepatan Maksimal: " + kecepatanMaksimal);
    }
}