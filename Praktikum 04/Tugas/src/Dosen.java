public class Dosen extends Pegawai {
    // atribut
    private String fakultas;

    // konstruktor tanpa parameter
    public Dosen(){
        super();
    }

    // konstruktor dengan parameter
    public Dosen(String nip, String nama, String tanggalLahir, String TMT, double gajiPokok, String fakultas){
        super(nip, nama, tanggalLahir, TMT, gajiPokok);
        this.fakultas = fakultas;
    }
    
    //getter
    public String getFakultas(){
        return fakultas;
    }

    // setter
    public void setFakultas(String fakultas){
        this.fakultas = fakultas;
    }

    // method
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Fakultas: " + fakultas);
    }
}
