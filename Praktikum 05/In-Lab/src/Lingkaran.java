public class Lingkaran extends BangunDatar implements IResize {
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

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("jari-jari: " + jari);
        System.out.println("Luas Lingkaran: " + getLuas());
        System.out.println("Keliling Lingkaran: " + getKeliling());

    }

    // impementasi abstract method
    @Override
     public double getLuas(){
        return Math.PI * jari * jari;
    }

    @Override
    public double getKeliling(){
        return Math.PI * jari * 2;
    }

    @Override
    public void zoomIn() {
        jari = jari * 1.1;
    }

    @Override
    public void zoomOut() {
        jari = jari * 0.9;
    }

    @Override
    public void zoom(int percent) {
        jari = jari * (percent / 100.0);
    }
}
