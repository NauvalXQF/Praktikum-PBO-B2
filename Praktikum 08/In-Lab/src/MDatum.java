public class MDatum {
    public static void main(String[] args) {

        Anabul kucingPj = new Kucing("Mpus", 3.5);
        Anabul anjingPj = new Anjing("Spike");

        Datum<Anabul> d1 = new Datum<>(kucingPj);
        
        System.out.println("=== UJI COBA KELAS GENERIK DATUM ===");
        System.out.print("Isi datum saat ini (Anabul pertama): ");
        d1.getIsi().bersuara();

        d1.setIsi(anjingPj);
        System.out.print("Isi datum setelah diubah: ");
        d1.getIsi().bersuara();
    }
}