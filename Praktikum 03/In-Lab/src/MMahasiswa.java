public class MMahasiswa {
    public static void main(String[] args){


        //objek Mata Kuliah
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);

        //objek Dosen
        Dosen d1 = new Dosen("123", "Tono Asoy", "Informatika");
        Dosen d2 = new Dosen("134", "Agung Wkwk", "Bio Informatika");

        //objek Mahasiswa
        Mahasiswa m1 = new Mahasiswa("0027", "Opank", "Informatika", "B3869CBN", "Motor");
        Mahasiswa m2 = new Mahasiswa("0001", "Davin", "Informatika", "B1745CKJ", "Mobil");

        //set DosenWali mahasiswa
        m1.setDosenWali(d2);
        m2.setDosenWali(d1);

        //menambahkan matkul ke mahasiswa
        m1.addMatkul(MBD);
        m1.addMatkul(PBO);
        m2.addMatkul(MBD);

        //detail mahasiswa
        m1.printDetailMhs();
        System.out.println();
        m2.printDetailMhs();
        System.out.println();


        System.out.println("Jumlah Mata Kuliah Diambil: " + m1.getJumlahMatKul());
        System.out.println("Jumlah SKS Diambil: " + m1.getJumlahSKS());
        System.out.println();

        System.out.println("Jumlah Mata Kuliah Diambil: " + m2.getJumlahMatKul());
        System.out.println("Jumlah SKS Diambil: " + m2.getJumlahSKS());


        

    }
    
}
