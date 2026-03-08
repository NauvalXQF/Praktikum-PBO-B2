    import java.util.ArrayList;

    public class Mahasiswa {
        //atribut
        private String nim;
        private String nama;
        private String prodi;
        private ArrayList<MataKuliah> listMatKul;
        private Dosen dosenWali;
        private Kendaraan kendaraan;

        //konstruktor tanpa parameter
        public Mahasiswa(){
            this.listMatKul = new ArrayList<>();
        }

        //konstruktor dengan parameter
        public Mahasiswa(String nim, String nama, String prodi, String noPlat, String jenis){
            this.nim = nim;
            this.nama = nama;
            this.prodi = prodi;
            this.listMatKul = new ArrayList<>();
            this.kendaraan = new Kendaraan(noPlat, jenis);
        }

        //getter
        public String getNim(){
            return nim;
        }

        public String getNama(){
            return nama;
        }

        public String getProdi(){
            return prodi;
        }

        public Dosen getDosenWali(){
            return dosenWali;
        }

        public Kendaraan getKendaraan(){
            return kendaraan;
        }

        //setter
        public void setNim(String nim){
            this.nim = nim;
        }

        public void setNama(String nama){
            this.nama = nama;
        }

        public void setProdi(String prodi){
            this.prodi = prodi;
        }

        public void setDosenWali(Dosen dosenwali){
            this.dosenWali = dosenwali;
        }

        //method addMatkul()
        public void addMatkul(MataKuliah matKul){
            listMatKul.add(matKul);
        }

        //method getJumlahMatKul
        public int getJumlahMatKul(){
            return listMatKul.size();
        }
        
        //method getJumlahSKS
        public int getJumlahSKS(){
            int total = 0;
            for (int i = 0; i < listMatKul.size(); i++){
                total += listMatKul.get(i).getSks();
            }
            return total;
        }

        //method printMhs()
        public void printMhs(){
            System.out.println("Nim: " + nim);
            System.out.println("Nama: " + nama);
            System.out.println("Prodi " + prodi);
        }

        //method printDetailMhs()
        public void printDetailMhs(){
            System.out.println("Nim: " + nim);
            System.out.println("Nama: " + nama);
            System.out.println("Prodi " + prodi);

            //menampilkan list mata kuliah
            System.out.println("Mata Kuliah Yang Diambil: ");
            for (int i = 0; i < listMatKul.size(); i++){
                System.out.println("- " + listMatKul.get(i).getNama());
            }

            
            
            //menampilkan bagian dosenwali
            System.out.println("Dosen Wali: ");
            System.out.println("\tNama Dosen Wali: " + dosenWali.getNama());
            System.out.println("\tNIP: " + dosenWali.getNip());
            System.out.println("\t" + dosenWali.getProdi());
            
            //menampilkan bagian kendaraan
            if (kendaraan != null){
                System.out.println("Kendaraan: " );
                System.out.println("\tJenis: " + kendaraan.getJenis() );
                System.out.println("\tNomor Plat: " + kendaraan.getNoPlat());
            }
            else{
                System.out.println("Kendaraan: Tidak punya kendaraan");
            }
        }
            
    }
