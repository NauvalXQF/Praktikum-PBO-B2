import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Manusia {
    // atribut
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    // konstruktor tanpa parameter
    public Manusia(){
        counterMns++;
    }

    // konstruktor dengan parameter (Terima String untuk tgl_mulai_kerja)
    public Manusia(String nama, String tgl_mulai_kerja, String alamat, double pendapatan){
        this.nama = nama;
        DateTimeFormatter formatTanggal = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.tgl_mulai_kerja = LocalDate.parse(tgl_mulai_kerja, formatTanggal);
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    // getter
    public String getNama(){
        return nama;
    }

    public LocalDate getTgl_mulai_kerja() {
        return tgl_mulai_kerja;
    }

    public String getAlamat(){
        return alamat;
    }

    public double getPendapatan(){
        return pendapatan;
    }
    
    // TAMBAHAN: Getter untuk atribut static
    public static int getCounterMns() {
        return counterMns;
    }

    // setter
    public void setNama(String nama){
        this.nama = nama;
    }

    public void setTgl_mulai_kerja(LocalDate tgl_mulai_kerja) {
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public void setPendapatan(double pendapatan){
        this.pendapatan = pendapatan;
    }

    // method 
    public void printInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Mulai Kerja: " + tgl_mulai_kerja);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
    }

    // implementasi method abstract
    public abstract int hitungMasaKerja();
}