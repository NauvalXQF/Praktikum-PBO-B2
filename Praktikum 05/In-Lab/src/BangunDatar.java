    public abstract class BangunDatar {
    protected int jmlSisi;
    protected String warna;
    protected String border;
    private static int counterBangunDatar = 0;

    protected BangunDatar() {
        ++counterBangunDatar;
    }

    protected BangunDatar(int var1, String var2, String var3) {
        this.jmlSisi = var1;
        this.warna = var2;
        this.border = var3;
        ++counterBangunDatar;
    }

    public int getJmlSisi() {
        return this.jmlSisi;
    }

    public String getWarna() {
        return this.warna;
    }

    public String getBorder() {
        return this.border;
    }

    public void setJmlSisi(int var1) {
        this.jmlSisi = var1;
    }

    public void setWarna(String var1) {
        this.warna = var1;
    }

    public void setBorder(String var1) {
        this.border = var1;
    }

    // method
    public void printInfo() {
        System.out.println("Jumlah Sisi: " + this.jmlSisi);
        System.out.println("Warna: " + this.warna);
        System.out.println("Border: " + this.border);
    }

    public static void printCounterBangunDatar() {
        System.out.println("Banyaknya objek yang dibuat: " + counterBangunDatar);
    }

    // abstract method
    public abstract double getLuas();
    public abstract double getKeliling();

    // method tambahan
    public boolean isEqualLuas(BangunDatar X){
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar X){
        return this.getKeliling() == X.getKeliling();
    }
}
