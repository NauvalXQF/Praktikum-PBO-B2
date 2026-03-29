public class MBangunDatar {
    public static void main(String[] args) {
        // buat objek 
        Persegi p1 = new Persegi("hitam", "putih", 5.0);
        Lingkaran l1 = new Lingkaran("abu-abu", "hitam", 7.0);

        // Tambahan untuk Langkah 3
        BangunDatar p2 = new Persegi("biru", "kuning", 5.0);

        // method
        System.out.println("-Persegi-");
        p1.printInfo();
        System.out.println();
        System.out.println("Luas persegi: " + p1.getLuas());
        System.out.println("Keliling persegi: " + p1.getKeliling());

        System.out.println("-Lingkaran-");
        l1.printInfo();
        System.out.println();
        System.out.println("Luas lingkaran: " + l1.getLuas());
        System.out.println("Keliling lingkaran: " + l1.getKeliling());
        System.out.println();
        l1.printInfo();
        System.out.println();
        p1.printInfo();

        BangunDatar.printCounterBangunDatar();
        
        // Tambahan untuk Langkah 5
        System.out.println("\nCek Perbandingan Luas p1 dan p2: " + p1.isEqualLuas(p2));


        p1.zoom(40);
        p1.printInfo();
        l1.zoom(10);
        l1.printInfo();
    }
}