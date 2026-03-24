public class DosenTamu extends Dosen{
    // atribut
    private String nidk;
    private String tanggalBerakhirKontrak;

    // konstruktor tanpa parameter
    public DosenTamu(){
        super();
    }

    // konstruktor dengan parameter
    public DosenTamu(String nip, String nama, String tanggalLahir, String TMT, double gajiPokok, String fakultas, String nidk, String tanggalBerakhirKontrak){
        super(nip, nama, tanggalLahir, TMT, gajiPokok, fakultas);
        this.nidk = nidk;
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
    }

    // getter
    public String getNidk(){
        return nidk;
    }

    public String getTanggalBerakhirKontrak(){
        return tanggalBerakhirKontrak;
    }

    // setter
    public void setNidk(String nidk){
        this.nidk = nidk;
    }

    public void setTanggalBerakhirKontrak(String tanggalBerakhirKontrak){
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
    }

    // method
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("NIDK: " + nidk);
        System.out.println("Tanggal Berakhir Kontrak: " + tanggalBerakhirKontrak);
    }
}
