import java.time.LocalDate;

public class Pengusaha extends Manusia implements Pajak {
    // atribut
    private String npwp;
    private static int counterPengusaha = 0;

    // konstrukor tanpa parameter
    public Pengusaha(){
        super();
        counterPengusaha++;
    }

    // konstruktor dengan parameter
    public Pengusaha(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String npwp){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    // getter
    public String getNpwp(){
        return npwp;
    }
    
    public static int getCounterPengusaha(){
        return counterPengusaha;
    }

    // setter
    public void setNpwp(String npwp){
        this.npwp = npwp;
    }

    // method
    @Override
    public double hitungPajak(){
        return 0.15 * pendapatan;
    }

    @Override
    public int hitungMasaKerja(){
        int tahunSekarang = LocalDate.now().getYear();
        int tahunMasuk = tgl_mulai_kerja.getYear();

        return (tahunSekarang - tahunMasuk) + 2;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("NPWP: " + getNpwp());
    }

}
