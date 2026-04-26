public class MMahasiswa {
    // Metode main untuk aplikasi semua varian
    public static void main(String[] args) {
        // c. Aplikasi konstruktor tanpa parameter
        System.out.println("c. Konstruktor tanpa parameter:");
        Mahasiswa m1 = new Mahasiswa();
        m1.display();

        // d. Aplikasi konstruktor dengan tiga parameter
        System.out.println("d. Konstruktor dengan tiga parameter:");
        Mahasiswa m2 = new Mahasiswa(12345, "John Doe", "Informatika");
        m2.display();

        // e. Aplikasi konstruktor dengan satu parameter objek Mahasiswa lain
        System.out.println("e. Konstruktor dengan satu parameter objek Mahasiswa lain (kloning):");
        Mahasiswa m3 = new Mahasiswa(m2);
        m3.display();

        // b. Contoh aplikasi semua varian operator setProgramStudi
        System.out.println("b. Aplikasi semua varian operator setProgramStudi:");

        // Varian 1: tanpa parameter
        System.out.println("Varian 1: setProgramStudi() - tanpa parameter");
        Mahasiswa m4 = new Mahasiswa(11111, "Alice", "Teknik Elektro");
        m4.setProgramStudi(); // Set ke "Kosong"
        m4.display();

        // Varian 2: dengan satu parameter string
        System.out.println("Varian 2: setProgramStudi(String) - dengan parameter string");
        Mahasiswa m5 = new Mahasiswa(22222, "Bob", "Teknik Sipil");
        m5.setProgramStudi("Teknik Mesin"); // Set ke "Teknik Mesin"
        m5.display();

        // Varian 3: dengan satu parameter objek Mahasiswa lain
        System.out.println("Varian 3: setProgramStudi(Mahasiswa) - dengan parameter objek Mahasiswa");
        Mahasiswa m6 = new Mahasiswa(33333, "Charlie", "Ekonomi");
        m6.setProgramStudi(m2); // Set ke ProgramStudi dari m2, yaitu "Informatika"
        m6.display();
    }
}
