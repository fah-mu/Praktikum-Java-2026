
package tugas1;

public class Nilai {
    String nim;
    String nama;
    double nilaiAbsen;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;
    double nilaiAkhir;
    
    void Nilai(){
        nilaiAkhir = (0.10 * nilaiAbsen) + (0.20 * nilaiTugas) + 
                      (0.30 * nilaiUTS) + (0.40 * nilaiUAS); //rumuss
    }
    
     void CetakNilai() {
        System.out.println("NIM         : " + nim);
        System.out.println("Nama        : " + nama);
        System.out.println("Nilai Absen : " + nilaiAbsen);
        System.out.println("Nilai Tugas : " + nilaiTugas);
        System.out.println("Nilai UTS   : " + nilaiUTS);
        System.out.println("Nilai UAS   : " + nilaiUAS);
        System.out.println("Nilai Akhir : " + nilaiAkhir); //blueprintt
    }
}
