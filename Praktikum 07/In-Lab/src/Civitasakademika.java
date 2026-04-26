// SOAL 4: POLIMORFISME UNIVERSAL INCLUSION
// Kelas Induk Civitasakademika
// File: Civitasakademika.java

public class Civitasakademika {
    // Atribut
    protected String Nama;

    // Konstruktor
    public Civitasakademika(String nama) {
        this.Nama = nama;
    }

    // Getter untuk Nama
    public String getNama() {
        return Nama;
    }

    // Setter untuk Nama
    public void setNama(String nama) {
        this.Nama = nama;
    }

    // Metode getNomor (akan di-override oleh kelas anak)
    public String getNomor() {
        return "Nomor tidak terdefinisi";
    }

    // Metode untuk menampilkan info
    public void tampilInfo() {
        System.out.println("Nama: " + Nama);
        System.out.println("Nomor: " + getNomor());
    }
}
