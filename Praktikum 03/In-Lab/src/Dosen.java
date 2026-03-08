public class Dosen{
    //atribut
    private String nip;
    private String nama;
    private String prodi;

    //konstruktor tanpa parameter
    public Dosen(){
        
    }

    //konstrukto dengan parameter
    public Dosen(String nip, String nama, String prodi){
        this.nama = nama;
        this.nip = nip;
        this.prodi = prodi;
    }

    //getter
    public String getNip(){
        return nip;
    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }

    //setter
    public void setNip(String nip){
        this.nip = nip;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }
}