import java.time.LocalDate;

public class PNS extends Manusia implements Pajak {
    // atribut
    private String nip;
    private static int counterPNS = 0;

    // konstrukor tanpa parameter
    public PNS(){
        super();
        counterPNS++;
    }

    // konstruktor dengan parameter
    public PNS(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String nip){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    // getter
    public String getNip(){
        return nip;
    }
    
    public static int getCounterPNS(){
        return counterPNS;
    }

    // setter
    public void setNip(String nip){
        this.nip = nip;
    }

    // method
    @Override
    public double hitungPajak(){
        return 0.1 * pendapatan;
    }

    @Override
    public int hitungMasaKerja(){
        int tahunSekarang = LocalDate.now().getYear();
        int tahunMasuk = tgl_mulai_kerja.getYear();

        return (tahunSekarang - tahunMasuk) + 7;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("NIP: " + getNip());
    }
    
}

