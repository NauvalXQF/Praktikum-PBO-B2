public class Persegi extends BangunDatar {
    // atribut
    private double pSisi;

    // konstruktor tanpa parameter
    public Persegi(){
        setJmlSisi(4);
    }

    // konstruktor dengan parameter
    public Persegi(String warna, String border, double pSisi){
        super(4, warna, border);
        this.pSisi = pSisi;
    }
    
    // getter
    public double getPSisi(){
        return pSisi;
    }

    // setter
    public void setPSisi(double pSisi){
        this.pSisi = pSisi;
    }

    public double getLuas(){
        return pSisi * pSisi;
    }

    public double getKeliling(){
        return  4 * pSisi;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Panjang Sisi: " + pSisi);
        System.out.println("Luas Persegi : " + getLuas());
        System.out.println("Keliling Persegi : " + getKeliling());

    }
}