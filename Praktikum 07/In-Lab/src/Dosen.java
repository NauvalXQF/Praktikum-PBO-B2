// SOAL 4: Kelas Anak - Dosen
// File: Dosen.java

public class Dosen extends Civitasakademika {
    // Atribut
    private String NIP;

    // Konstruktor
    public Dosen(String nama, String nip) {
        super(nama);
        this.NIP = nip;
    }

    // Getter untuk NIP
    public String getNIP() {
        return NIP;
    }

    // Setter untuk NIP
    public void setNIP(String nip) {
        this.NIP = nip;
    }

    // Override metode getNomor
    @Override
    public String getNomor() {
        return NIP;
    }

    // Metode tampilInfo
    @Override
    public void tampilInfo() {
        System.out.println("Nama Dosen: " + Nama);
        System.out.println("NIP: " + getNomor());
    }
}
