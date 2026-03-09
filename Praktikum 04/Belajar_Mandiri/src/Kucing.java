public class Kucing extends Hewan {
    //atribut
    private String ras;

    //konstruktor tanpa parameter
    public Kucing(){
    }

    //konstruktor dengan parameter
    public Kucing(String nama, String warna, String ras){
        super(nama, warna);
        this.ras = ras;
    }

    //getter
    public String getRas(){
        return ras;
    }

    //setter
    public void setRas(String ras){
        this.ras = ras;
    }

    //implementasi method abstract
    @Override
    public String suara(){
        return "Meow!";
    }

    @Override
    public String gerak(){
        return "dengan cara berjalan 4 kaki";
    }

    
}
