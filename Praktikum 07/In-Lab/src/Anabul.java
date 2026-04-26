// SOAL 3: POLIMORFISME UNIVERSAL INCLUSION
// Kelas Induk Anabul (Hewan Peliharaan)
// File: Anabul.java

public class Anabul {
    // Atribut
    protected String Nama;

    // Konstruktor
    public Anabul(String nama) {
        this.Nama = nama;
    }

    // Getter dan Setter untuk Nama
    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        this.Nama = nama;
    }

    // Metode Gerak (polymorphic method)
    public void Gerak() {
        System.out.println(Nama + " bergerak");
    }

    // Metode Bersuara (polymorphic method)
    public void Bersuara() {
        System.out.println(Nama + " berbunyi");
    }
}
