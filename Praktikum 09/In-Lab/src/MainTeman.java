public class MainTeman {
    public static void main(String[] args) {
        Teman t = new Teman();

        t.addNama("Budi");
        t.addNama("Sari");
        t.addNama("Budi");
        t.addNama("Andi");

        t.showTeman();
        System.out.println("Jumlah: " + t.getNbelm());
        System.out.println("Index 1: " + t.getNama(1));
        System.out.println("Ada Sari? " + t.isMember("Sari"));
        System.out.println("Budi muncul: " + t.countNama("Budi") + "x");

        t.gantiNama("Andi", "Rudi");
        t.delNama("Sari");
        t.showTeman();
    }
}