public class Lingkaran extends BangunDatar {
    // atribut
    private double jari;

    // konstruktor tanpa parameter
    public Lingkaran(){
        super();
    }

    // konstruktor dengan parameter
    public Lingkaran(String warna, String border, double jari){
        super(1, warna, border);
        this.jari = jari;
    }

    // getter
    public double getJari(){
        return jari;
    }

    // setter
    public void setJari(double jari){
        this.jari = jari;
    }

    public double getLuas(){
        return Math.PI * jari * jari;
    }

    public double getKeliling(){
        return Math.PI * jari * 2;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("jari-jari: " + jari);
        System.out.println("Luas Lingkaran: " + getLuas());
        System.out.println("Keliling Lingkaran: " + getKeliling());

    }
    
}
