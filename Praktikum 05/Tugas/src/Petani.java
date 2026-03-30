import java.time.LocalDate;

public class Petani extends Manusia implements Pajak {
    // atribut 
    private String asalKota;
    private static int counterPetani = 0;

    // konstrukor tanpa parameter
    public Petani(){
        super();
        counterPetani++;
    }

    // konstruktor dengan parameter
    public Petani(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String asalKota){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asalKota = asalKota;
        counterPetani++;
    }

    // getter
    public String getAsalKota(){
        return asalKota;
    }
    
    public static int getCounterPetani(){
        return counterPetani;
    }

    // setter
    public void setAsalKota(String asalKota){
        this.asalKota = asalKota;
    }

    // method
    @Override
    public double hitungPajak(){
        return 0;
    }

    @Override
    public int hitungMasaKerja(){
        int tahunSekarang = LocalDate.now().getYear();
        int tahunMasuk = tgl_mulai_kerja.getYear();

        return (tahunSekarang - tahunMasuk) + 0;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Asal Kota: " + getAsalKota());
    }
}
