// SOAL 3: Kelas Anak - Kucing
// File: Kucing.java

public class Kucing extends Anabul {
    // Konstruktor
    public Kucing(String nama) {
        super(nama);
    }

    // Override metode Gerak
    @Override
    public void Gerak() {
        System.out.println(Nama + " bergerak dengan melata");
    }

    // Override metode Bersuara
    @Override
    public void Bersuara() {
        System.out.println(Nama + " berbunyi meong");
    }
}
