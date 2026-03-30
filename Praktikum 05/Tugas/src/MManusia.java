public class MManusia {
    public static void main(String[] args) {

        // objek PNS
        PNS p1 = new PNS("Satriyo", "01-04-2006", "Jl. Seroja", 15000000.0, "198302032006041002");
        PNS p2 = new PNS("Panji", "01-04-2010", "", 10000000.0, "198004212010041002");

        // objek Pengusaha
        Pengusaha pe1 = new Pengusaha("Adhy", "01-01-2000", "Jl.Air", 55000000.0, "2000-556-773-212-000-5");

        // objek Petani
        Petani pt1 = new Petani("Nugraha", "09-01-1977", "Jl. Bunga 9 Tembalang", 5000000.0, "wonogiri");

        // set alamat PNS p2
        p2.setAlamat("Jl. Panorama 111 Tembalang");

        // detail manusia
        System.out.println("--- Detail PNS ---");
        p1.printInfo();
        System.out.println();
        
        System.out.println("--- Detail Pengusaha ---");
        pe1.printInfo();
        System.out.println();
        
        System.out.println("--- Detail Petani ---");
        pt1.printInfo();
        System.out.println();

        // menampilkan jumlah objek yang dibuat
        System.out.println("Jumlah Manusia: " + Manusia.getCounterMns());
        System.out.println("Jumlah PNS: " + PNS.getCounterPNS());
        System.out.println("Jumlah Pengusaha: " + Pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani: " + Petani.getCounterPetani());
        System.out.println();

        // menampilkan perhitungan pajak
        System.out.println("Pajak PNS p1: " + p1.hitungPajak());
        System.out.println("Pajak Pengusaha pe1: " + pe1.hitungPajak());
        System.out.println("Pajak Petani pt1: " + pt1.hitungPajak());
        System.out.println();

        // menampilkan masa kerja
        System.out.println("Masa Kerja p1: " + p1.hitungMasaKerja() + " tahun");
        System.out.println("Masa Kerja pe1: " + pe1.hitungMasaKerja() + " tahun");
        System.out.println("Masa Kerja pt1: " + pt1.hitungMasaKerja() + " tahun");
        System.out.println();

    }
}