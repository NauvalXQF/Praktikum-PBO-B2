// SOAL 4: Kelas Anak - Mahasiswa (untuk Seminar)
// File: MahasiswaSeminar.java

public class MahasiswaSeminar extends Civitasakademika {
    // Atribut
    private String NIM;
    private Dosen DosenWali;

    // Konstruktor
    public MahasiswaSeminar(String nama, String nim) {
        super(nama);
        this.NIM = nim;
        this.DosenWali = null;
    }

    // Konstruktor dengan DosenWali
    public MahasiswaSeminar(String nama, String nim, Dosen dosenWali) {
        super(nama);
        this.NIM = nim;
        this.DosenWali = dosenWali;
    }

    // Getter untuk NIM
    public String getNIM() {
        return NIM;
    }

    // Setter untuk NIM
    public void setNIM(String nim) {
        this.NIM = nim;
    }

    // Getter untuk DosenWali
    public Dosen getDosenWali() {
        return DosenWali;
    }

    // Override metode getNomor
    @Override
    public String getNomor() {
        return NIM;
    }

    // Prosedur setWali untuk mengubah isian komponen dosenwali
    public void setWali(Dosen dosen) {
        this.DosenWali = dosen;
    }

    // Prosedur tampilDataMahasiswa untuk menampilkan data lengkap
    public void tampilDataMahasiswa() {
        System.out.println("NIM: " + NIM);
        System.out.println("Nama Mahasiswa: " + Nama);
        if (DosenWali != null) {
            System.out.println("Nama Dosen Wali: " + DosenWali.getNama());
        } else {
            System.out.println("Nama Dosen Wali: Belum ditentukan");
        }
    }

    // Metode tampilInfo
    @Override
    public void tampilInfo() {
        System.out.println("Nama Mahasiswa: " + Nama);
        System.out.println("NIM: " + getNomor());
    }
}
