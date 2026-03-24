import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
public class Pegawai{
    // atribut
    private String nip;
    private String nama;
    private String tanggalLahir;
    private String TMT;
    private double gajiPokok;

    // konstruktor tanpa parameter
    public Pegawai(){}

    // konstruktor dengan parameter
    public Pegawai(String nip, String nama, String tanggalLahir, String TMT, double gajiPokok){
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.TMT = TMT;
        this.gajiPokok = gajiPokok;
    }

    // getter 
    public String getNip(){
        return nip;
    }

    public String getNama(){
        return nama;
    }

    public String getTanggalLahir(){
        return tanggalLahir;
    }

    public String getTMT(){
        return TMT;
    }

    public double getGajiPokok(){
        return gajiPokok;
    }

    // setter
    public void setNip(String nip){
        this.nip = nip;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setTanggalLahir(String tanggalLahir){
        this.tanggalLahir = tanggalLahir;
    }

    public void setTMT(String TMT){
        this.TMT = TMT;
    }

    public void setGajiPokok(double gajiPokok){
        this.gajiPokok = gajiPokok;
    }
    
    private LocalDate ubahKeTanggal(String tanggalTeks) {
        // Alat ini ngajarin Java baca "5 Mei 1990" pakai kalender bahasa Indonesia
        DateTimeFormatter formatIndo = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        return LocalDate.parse(tanggalTeks, formatIndo);
    }

    //method
    public void printInfo(){
        System.out.println("NIP: " + nip);
        System.out.println("NAMA: " + nama);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("TMT: " + TMT);
        System.out.println("Gaji Pokok: " + gajiPokok);
    }

    // menthod
    public int getTahunMasaKerja() {
        LocalDate tanggalTmt = ubahKeTanggal(TMT);
        LocalDate sekarang = LocalDate.now();
        // Ngambil selisih tahunnya aja
        return Period.between(tanggalTmt, sekarang).getYears(); 
    }

    public String getDetailMasaKerja() {
        LocalDate tanggalTmt = ubahKeTanggal(TMT);
        LocalDate sekarang = LocalDate.now();
        Period selisih = Period.between(tanggalTmt, sekarang);
        // Mengembalikan teks "X tahun Y bulan"
        return selisih.getYears() + " tahun " + selisih.getMonths() + " bulan";
    }

    public String hitungTanggalPensiun(int bup) {
        LocalDate tanggalLahirAsli = ubahKeTanggal(tanggalLahir);
        
        // Logika Pensiun: Ditambah umur BUP, ditambah 1 bulan, lalu di-set jadi tanggal 1
        LocalDate tanggalPensiun = tanggalLahirAsli.plusYears(bup).plusMonths(1).withDayOfMonth(1);
        
        DateTimeFormatter formatIndo = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        return tanggalPensiun.format(formatIndo);
    }
}