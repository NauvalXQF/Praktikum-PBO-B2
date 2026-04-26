// SOAL 3: Kelas Anak - Anjing
// File: Anjing.java

public class Anjing extends Anabul {
    // Konstruktor
    public Anjing(String nama) {
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
        System.out.println(Nama + " berbunyi guk-guk");
    }
}
