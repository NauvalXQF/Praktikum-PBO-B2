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
        System.out.println("NIDN: " + nidn);
        System.out.println("BUP: " + bup);
    }
}
