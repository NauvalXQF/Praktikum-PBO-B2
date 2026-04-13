public class AngkaSial {
    
    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            // method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

/*
===================================================================
JAWABAN PERTANYAAN PRAKTIKUM:

1. Ketika eksepsi terjadi, apakah baris 12 (System.out.println(angka+" bukan angka sial");) dieksekusi?
Jawaban: 
TIDAK. Ketika angka 13 dimasukkan, program mengeksekusi baris 10 yaitu melempar 
eksepsi (throw). Saat hal ini terjadi, aliran program langsung terhenti dan keluar 
dari method cobaAngka untuk mencari blok catch, sehingga baris 12 otomatis dilewati.

2. Apakah baris 21 (as.cobaAngka(12);) dieksekusi?
Jawaban: 
TIDAK. Pada baris 20 (as.cobaAngka(13);), eksepsi telah dilemparkan. Dalam mekanisme 
try-catch, begitu sebuah eksepsi terjadi di dalam blok try, sisa kode di bawahnya 
(dalam blok try yang sama) akan dihentikan. Program langsung melompat ke blok catch, 
sehingga baris 21 tidak akan pernah sempat dieksekusi.
===================================================================
*/