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

    //method
    public void printInfo(){
        System.out.println("NIP: " + nip);
        System.out.println("NAMA: " + nama);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("TMT: " + TMT);
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}