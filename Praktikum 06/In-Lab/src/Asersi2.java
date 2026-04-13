class Lingkaran {
    private double jariJari;
    
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }
    
    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        
        assert (jariJari > 0) : "jari jari tidak boleh nol!!!";
        
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}

/*
===================================================================
JAWABAN PERTANYAAN PRAKTIKUM:
Secara konsep, ada yang kurang tepat pada program Asersi2 di atas.

Konsep penggunaan Asersi pada program Asersi2 kurang tepat karena asersi 
tidak seharusnya digunakan untuk memvalidasi input/argumen. Asersi secara default 
dimatikan oleh Java saat program berjalan normal. Jika program dijalankan 
tanpa argumen '-enableassertions', maka baris validasi akan dilewati sepenuhnya. 
Akibatnya, objek Lingkaran akan tetap dibuat dengan nilai jari-jari = 0, dan 
kelilingnya menjadi 0 tanpa ada peringatan error. Untuk validasi nilai seperti ini, 
praktik yang benar adalah menggunakan Eksepsi (misalnya IllegalArgumentException).
===================================================================
*/