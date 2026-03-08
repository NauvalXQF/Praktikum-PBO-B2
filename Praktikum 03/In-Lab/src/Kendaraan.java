public class Kendaraan {
    //atribut
    private String noPlat;
    private String jenis;

    //konstruktor tanpa parameter
    public Kendaraan(){

    }

    //konstruktor dengan parameter
    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    //getter
    public String getNoPlat(){
        return noPlat;
    }

    public String getJenis(){
        return jenis;
    }

    //setter
    public void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    public void setJenis(String jenis){
        this.jenis = jenis;
    }
}
