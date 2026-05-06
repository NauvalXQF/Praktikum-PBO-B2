import java.util.*;

public class Teman {
    private int nbelm;
    private List<String> Lnama;

    // Konstruktor
    public Teman() {
        Lnama = new ArrayList<>();
        nbelm = 0;
    }

    // a. Jumlah elemen
    public int getNbelm() {
        return Lnama.size();
    }

    // b. Ambil nama berdasarkan index
    public String getNama(int indeks) {
        return Lnama.get(indeks);
    }

    // c. Ubah nama di index tertentu
    public void setNama(int indeks, String nama) {
        Lnama.set(indeks, nama);
    }

    // d. Tambah nama
    public void addNama(String nama) {
        Lnama.add(nama);
        nbelm++;
    }

    // e. Hapus nama
    public void delNama(String nama) {
        Lnama.remove(nama);
        nbelm--;
    }

    // f. Cek apakah nama ada
    public boolean isMember(String nama) {
        return Lnama.contains(nama);
    }

    // g. Ganti nama lama dengan baru
    public void gantiNama(String nama, String namaBaru) {
        int idx = Lnama.indexOf(nama);
        if (idx != -1) {
            Lnama.set(idx, namaBaru);
        }
    }

    // h. Hitung kemunculan nama
    public int countNama(String nama) {
        int count = 0;
        for (String n : Lnama) {
            if (n.equals(nama)) count++;
        }
        return count;
    }

    // i. Tampilkan semua nama
    public void showTeman() {
        System.out.println("Daftar Teman:");
        for (String n : Lnama) {
            System.out.println("- " + n);
        }
    }
}