public class Burung extends Hewan implements IBisa {
    //atribut
    private String jenisParuh;

    //konstruktor tanpa parameter
    public Burung(){
    }

    //konstruktor dengan parameter
    public Burung(String nama, String warna, String jenisParuh){
        super(nama, warna);
        this.jenisParuh = jenisParuh;
    }

    //getter
    public String getJenisParuh(){
        return jenisParuh;
    }
    
    //setter
    public void setJenisParuh(String jenisParuh){
        this.jenisParuh = jenisParuh;
    }

    //implementasi abstract method
    @Override
    public String suara(){
        return "CIcit!";
    }

    @Override
    public String gerak(){
        return "Terbang Dengan Sayap";
    }

    //implementasi interface
    @Override
    public boolean bisaTerbang(){
        return true;
    }
}
