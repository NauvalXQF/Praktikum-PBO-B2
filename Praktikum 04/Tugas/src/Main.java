public class Main {
    public static void main(String[] args) {
        System.out.println("--- SLIP GAJI DOSEN TETAP ---");

        // 1. Memasukkan data Pak Andi persis sesuai soal dosen
        // Urutan konstruktor: NIP, Nama, Tanggal Lahir, TMT, Gaji Pokok, Fakultas, NIDN
        DosenTetap pakAndi = new DosenTetap(
            "9545647548", 
            "Andi", 
            "5 Mei 1990", 
            "1 Januari 2015", 
            5000000, 
            "Fakultas Sains dan Matematika", 
            "78647324"
        );

        // 2. Langsung cetak semua info dan perhitungannya!
        pakAndi.printInfo();
        
        // 3. Tambahan cetak Total Gaji biar makin mantap
        System.out.println("Total Gaji Diterima: Rp " + pakAndi.hitungTotalGaji());
        System.out.println();
    }
}