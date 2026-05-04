
package polymorphism;

class Motor extends Kendaraan {
    private String jenisMesin;

    // Constructor
    public Motor(String merk, int kecepatanMaksimal, String jenisMesin) {
        super(merk, kecepatanMaksimal);
        this.jenisMesin = jenisMesin;
    }

    // Override gerakkan()
    @Override
    public void gerakkan() {
        System.out.println("Motor " + merk + " melaju di jalan!");
    }

    // Override infoKendaraan()
    @Override
    public void infoKendaraan() {
        super.infoKendaraan();
        System.out.println("Jenis Mesin: " + jenisMesin);
    }
}
