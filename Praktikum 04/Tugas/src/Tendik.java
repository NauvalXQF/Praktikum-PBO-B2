public class Tendik extends Pegawai {
    // atribut
    private String bidang;
    private int bup = 55;

    // konstruktor tanpa parameter
    public Tendik(){
        super();
    }

    // konstruktor dengan parameter
    public Tendik(String nip, String nama, String tanggalLahir, String TMT, double gajiPokok, String bidang){
        super(nip, nama, tanggalLahir, TMT, gajiPokok);
        this.bidang = bidang;
    }

    // getter
    public String getBidang(){
        return bidang;
    }

    public int getBup(){
        return bup;
    }

    // setter
    public void setBidang(String bidang){
        this.bidang = bidang;
    }

    // method
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Bidang: " + bidang);
        System.out.println("BUP: " + bup);
    }

    public double hitungTunjangan(){
        return 0.01 * getTahunMasaKerja() * getGajiPokok();
    }

    public double hitungTotalGaji(){
        return hitungTunjangan() + getGajiPokok();
    }
}
