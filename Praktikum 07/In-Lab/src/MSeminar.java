// SOAL 4: Program Utama (Main) - MSeminar
// File: MSeminar.java
// Program aplikasi untuk kelas Civitasakademika, Dosen, Mahasiswa, dan Seminar

public class MSeminar {
    public static void main(String[] args) {
        System.out.println(" SOAL 4: POLIMORFISME UNIVERSAL INCLUSION ");
        System.out.println("Program Aplikasi Seminar dengan Peserta Dosen dan Mahasiswa");

        // e. Membuat 2 objek dosen
        System.out.println("e. Membuat 2 objek Dosen:");
        Dosen dosen1 = new Dosen("Dr. Bambang Sugito", "198501201980031001");
        Dosen dosen2 = new Dosen("Prof. Siti Khotijah", "195610201982032002");
        System.out.println("   Dosen 1: " + dosen1.getNama() + " (NIP: " + dosen1.getNIP() + ")");
        System.out.println("   Dosen 2: " + dosen2.getNama() + " (NIP: " + dosen2.getNIP() + ")\n");

        // e. Membuat 5 objek mahasiswa
        System.out.println("e. Membuat 5 objek Mahasiswa:");
        MahasiswaSeminar mhs1 = new MahasiswaSeminar("Aditya Pratama", "2024001");
        MahasiswaSeminar mhs2 = new MahasiswaSeminar("Rida Kartini", "2024002");
        MahasiswaSeminar mhs3 = new MahasiswaSeminar("Budi Santoso", "2024003");
        MahasiswaSeminar mhs4 = new MahasiswaSeminar("Siti Nurhaliza", "2024004");
        MahasiswaSeminar mhs5 = new MahasiswaSeminar("Ahmad Yusuf", "2024005");

        System.out.println("   Mahasiswa 1: " + mhs1.getNama() + " (NIM: " + mhs1.getNIM() + ")");
        System.out.println("   Mahasiswa 2: " + mhs2.getNama() + " (NIM: " + mhs2.getNIM() + ")");
        System.out.println("   Mahasiswa 3: " + mhs3.getNama() + " (NIM: " + mhs3.getNIM() + ")");
        System.out.println("   Mahasiswa 4: " + mhs4.getNama() + " (NIM: " + mhs4.getNIM() + ")");
        System.out.println("   Mahasiswa 5: " + mhs5.getNama() + " (NIM: " + mhs5.getNIM() + ")\n");

        // Membuat objek Seminar
        Seminar seminar = new Seminar();

        // c. Menampilkan banyaknya peserta seminar sebelum registrasi
        System.out.println("c. Banyaknya peserta sebelum registrasi: " + Seminar.countPeserta() + "\n");

        // f. Ujian prosedur registrasi dengan ketujuh objek peserta
        System.out.println("f. Registrasi peserta seminar:");
        Seminar.registrasi(dosen1);
        System.out.println("   Dosen 1 berhasil didaftarkan");
        Seminar.registrasi(dosen2);
        System.out.println("   Dosen 2 berhasil didaftarkan");
        Seminar.registrasi(mhs1);
        System.out.println("   Mahasiswa 1 berhasil didaftarkan");
        Seminar.registrasi(mhs2);
        System.out.println("   Mahasiswa 2 berhasil didaftarkan");
        Seminar.registrasi(mhs3);
        System.out.println("   Mahasiswa 3 berhasil didaftarkan");
        Seminar.registrasi(mhs4);
        System.out.println("   Mahasiswa 4 berhasil didaftarkan");
        Seminar.registrasi(mhs5);
        System.out.println("   Mahasiswa 5 berhasil didaftarkan\n");

        // c. Menampilkan banyaknya peserta seminar setelah registrasi
        System.out.println("c. Banyaknya peserta setelah registrasi: " + Seminar.countPeserta() + "\n");

        // g. Menampilkan daftar peserta
        Seminar.tampilPeserta();

        // h. Menampilkan banyaknya peserta mahasiswa menggunakan instanceof
        System.out.println("h. Banyaknya peserta mahasiswa (menggunakan instanceof): " + 
                         Seminar.countMahasiswa() + "\n");

        // i. Mengatur Dosen Wali untuk setiap mahasiswa
        System.out.println("i. Pengaturan Dosen Wali untuk Mahasiswa:");
        mhs1.setWali(dosen1);
        System.out.println("   " + mhs1.getNama() + " telah ditentukan Dosen Wali: " + dosen1.getNama());
        
        mhs2.setWali(dosen1);
        System.out.println("   " + mhs2.getNama() + " telah ditentukan Dosen Wali: " + dosen1.getNama());
        
        mhs3.setWali(dosen2);
        System.out.println("   " + mhs3.getNama() + " telah ditentukan Dosen Wali: " + dosen2.getNama());
        
        mhs4.setWali(dosen2);
        System.out.println("   " + mhs4.getNama() + " telah ditentukan Dosen Wali: " + dosen2.getNama());
        
        mhs5.setWali(dosen2);
        System.out.println("   " + mhs5.getNama() + " telah ditentukan Dosen Wali: " + dosen2.getNama() + "\n");

        // j. Menampilkan data lengkap mahasiswa
        System.out.println("j. Data Lengkap Mahasiswa:");
        System.out.println();
        mhs1.tampilDataMahasiswa();
        System.out.println();
        mhs2.tampilDataMahasiswa();
        System.out.println();
        mhs3.tampilDataMahasiswa();
        System.out.println();
        mhs4.tampilDataMahasiswa();
        System.out.println();
        mhs5.tampilDataMahasiswa();
    }
}
