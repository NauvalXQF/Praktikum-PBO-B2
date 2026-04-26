// SOAL 4: Kelas Aplikator Seminar
// File: Seminar.java

public class Seminar {
    // Atribut statis
    private static final int KAPASITAS_MAKSIMAL = 100;
    private static Civitasakademika[] pesertas = new Civitasakademika[KAPASITAS_MAKSIMAL];
    private static int banyakpeserta;

    // Konstruktor Seminar
    public Seminar() {
        banyakpeserta = 0;
    }

    // Fungsi countPeserta untuk menghitung banyaknya peserta seminar
    public static int countPeserta() {
        return banyakpeserta;
    }

    // Prosedur registrasi untuk menambahkan seorang peserta
    public static boolean registrasi(Civitasakademika peserta) {
        if (banyakpeserta < KAPASITAS_MAKSIMAL) {
            pesertas[banyakpeserta] = peserta;
            banyakpeserta++;
            return true;
        } else {
            System.out.println("Kapasitas seminar sudah penuh!");
            return false;
        }
    }

    // Prosedur tampilPeserta untuk menampilkan daftar semua peserta
    public static void tampilPeserta() {
        System.out.println("\n DAFTAR PESERTA SEMINAR ");
        System.out.println("Total Peserta: " + banyakpeserta);

        for (int i = 0; i < banyakpeserta; i++) {
            System.out.println((i + 1) + ". Nomor: " + pesertas[i].getNomor() + 
                             " | Nama: " + pesertas[i].getNama());
        }
    }

    // Fungsi countMahasiswa untuk menghitung banyaknya peserta mahasiswa
    public static int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < banyakpeserta; i++) {
            if (pesertas[i] instanceof MahasiswaSeminar) {
                count++;
            }
        }
        return count;
    }

    // Metode untuk mendapatkan array peserta
    public static Civitasakademika[] getPesertas() {
        return pesertas;
    }

    // Metode untuk mendapatkan banyak peserta
    public static int getBanyakPeserta() {
        return banyakpeserta;
    }
}
