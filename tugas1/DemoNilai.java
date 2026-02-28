
package tugas1;

public class DemoNilai {
    public static void main(String[] args) {

        Nilai n = new Nilai();

        n.nim = "2510631170034";
        n.nama = "Fahmi Mubaroq";
        n.nilaiAbsen = 100;
        n.nilaiTugas = 90;
        n.nilaiUTS = 80;
        n.nilaiUAS = 90;

        // menghitung nilai akhir
        n.Nilai();

        //dari blueprint di class nilai
        n.CetakNilai();
    }
}
