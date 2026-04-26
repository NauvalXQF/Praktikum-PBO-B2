public class Mahasiswa {
    // Atribut
    private int NIM;
    private String Nama;
    private String ProgramStudi;

    // Konstruktor tanpa parameter (default)
    public Mahasiswa() {
        this.NIM = -999;
        this.Nama = "n/a";
        this.ProgramStudi = "n/a";
    }

    // Konstruktor dengan tiga parameter
    public Mahasiswa(int NIM, String Nama, String ProgramStudi) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.ProgramStudi = ProgramStudi;
    }

    // Konstruktor dengan satu parameter objek Mahasiswa (kloning)
    public Mahasiswa(Mahasiswa m) {
        this.NIM = m.NIM;
        this.Nama = m.Nama;
        this.ProgramStudi = m.ProgramStudi;
    }

    // Getter dan Setter untuk NIM
    public int getNIM() {
        return NIM;
    }

    public void setNIM(int NIM) {
        this.NIM = NIM;
    }

    // Getter dan Setter untuk Nama
    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    // Getter dan Setter untuk ProgramStudi
    public String getProgramStudi() {
        return ProgramStudi;
    }

    // Operator setProgramStudi dengan tiga varian
    // Varian 1: tanpa parameter
    public void setProgramStudi() {
        this.ProgramStudi = "Kosong";
    }

    // Varian 2: dengan satu parameter string
    public void setProgramStudi(String programStudi) {
        this.ProgramStudi = programStudi;
    }

    // Varian 3: dengan satu parameter objek Mahasiswa lain
    public void setProgramStudi(Mahasiswa m) {
        this.ProgramStudi = m.ProgramStudi;
    }

    // Metode untuk menampilkan informasi Mahasiswa
    public void display() {
        System.out.println("NIM: " + NIM);
        System.out.println("Nama: " + Nama);
        System.out.println("Program Studi: " + ProgramStudi);
        System.out.println();
    }

}