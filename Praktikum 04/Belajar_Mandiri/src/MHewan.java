public class MHewan {
    public static void main(String[] args) {
        
        //objek kucing
        Kucing k1 = new Kucing("lilo", "putih", "anggora");
        Kucing k2 = new Kucing("Milo", "abu-abu", "persia");

        //objek burung
        Burung b1 = new Burung("pipit", "merah", "runcing");
        Burung b2 = new Burung("puyuh", "cream", "pipih");


        //printInfo()
        System.out.println("\n-Data Kucing-");
        k1.printInfo();
        k2.printInfo();
        System.out.println("\n-Data Burung-");
        b1.printInfo();
        b2.printInfo();


        //print interface
        System.out.println("\napakah burung bisa terbang: " + b1.bisaTerbang());
        System.out.println("\napakah burung bisa terbang: " + b2.bisaTerbang());
    }
    
}
