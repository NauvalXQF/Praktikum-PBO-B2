public abstract class Hewan {
    //atribut
    private String nama;
    private String warna;

    //konstruktor tanpa parameter
    public Hewan(){
    }

    //konstruktor dengan parameter
    public Hewan(String nama, String warna){
        this.nama = nama;
        this.warna = warna;
    }

    //getter
    public String getNama(){
        return nama;
    }

    public String getWarna(){
        return warna;
    }

    //setter 
    public void setWarna(String warna){
        this.warna = warna;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    //abstract method
    public abstract String suara();
    public abstract String gerak();

    public void printInfo(){
        System.out.println("Suaranya: " + suara());
        System.out.println("Cara Geraknya: " + gerak());
    }
    
}
