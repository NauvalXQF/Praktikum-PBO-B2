public class DosenTetap extends Dosen {
    // atribut
    private String nidn;
    private int bup = 65;

    // konstruktor tanpa parameter
    public DosenTetap(){
        super();
    }
    
    public DosenTetap(String nip, String nama, String tanggalLahir, String TMT, double gajiPokok, String fakultas, String nidn){
        super(nip, nama, tanggalLahir, TMT, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    // getter
    public String getNidn(){
        return nidn;
    }

    public int getBUP(){
        return bup;
    }

    // setter
    public void setNidn(String nidn){
        this.nidn = nidn;
    }

    // method
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Jabatan: Dosen Tetap");
        System.out.println("Fakultas: " + getFakultas());
        System.out.println("NIDN: " + nidn);
        System.out.println("Masa Kerja: " + getDetailMasaKerja()); // Manggil dari Pegawai
        System.out.println("Tanggal Pensiun: " + hitungTanggalPensiun(bup)); // Manggil dari Pegawai
        
        // Cetak detail tunjangan
        System.out.println("Tunjangan: 2% x " + getTahunMasaKerja() + " x Rp " + getGajiPokok() + " = Rp " + hitungTunjangan());
    }

    public double hitungTunjangan(){
        return 0.02 * getTahunMasaKerja() * getGajiPokok();
    }

    public double hitungTotalGaji(){
        return getGajiPokok() + hitungTunjangan();
    }
}
