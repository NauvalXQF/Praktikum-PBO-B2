public class Persegi extends BangunDatar implements IResize {
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

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Panjang Sisi: " + pSisi);
        System.out.println("Luas Persegi : " + getLuas());
        System.out.println("Keliling Persegi : " + getKeliling());

    }

    // implementasi abstract method
    @Override
    public double getLuas(){
        return pSisi * pSisi;
    }

    @Override
    public double getKeliling(){
        return 4 * pSisi;
    }

    @Override
    public void zoomIn() {
        pSisi = pSisi * 1.1;
    }

    @Override
    public void zoomOut() {
        pSisi = pSisi * 0.9;
    }

    @Override
    public void zoom(int percent) {
        // Dibagi 100.0 biar hasilnya desimal, bukan pembulatan integer
        pSisi = pSisi * (percent / 100.0); 
    }
}