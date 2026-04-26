// SOAL 3: Kelas Anak - Burung
// File: Burung.java

public class Burung extends Anabul {
    // Konstruktor
    public Burung(String nama) {
        super(nama);
    }

    // Override metode Gerak
    @Override
    public void Gerak() {
        System.out.println(Nama + " bergerak dengan terbang");
    }

    // Override metode Bersuara
    @Override
    public void Bersuara() {
        System.out.println(Nama + " berbunyi cuit");
    }
}
