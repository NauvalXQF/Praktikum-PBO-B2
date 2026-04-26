// SOAL 3: Program Utama (Main) - MAnabul
// File: MAnabul.java
// Simulasi semua bunyi dan gerakan setiap tipe anabul

public class MAnabul {
    public static void main(String[] args) {
        // Membuat objek-objek Anabul
        Kucing kucing1 = new Kucing("Whiskers");
        Anjing anjing1 = new Anjing("Doggy");
        Burung burung1 = new Burung("Tweety");

        // Simulasi gerakan dan suara kucing
        System.out.println("- KUCING -");
        kucing1.Gerak();
        kucing1.Bersuara();
        System.out.println();

        // Simulasi gerakan dan suara anjing
        System.out.println("- ANJING -");
        anjing1.Gerak();
        anjing1.Bersuara();
        System.out.println();

        // Simulasi gerakan dan suara burung
        System.out.println("- BURUNG -");
        burung1.Gerak();
        burung1.Bersuara();
        System.out.println();

        // Demonstrasi polimorfisme dengan array
        Anabul[] semuaAnabul = new Anabul[3];
        semuaAnabul[0] = new Kucing("Manja");
        semuaAnabul[1] = new Anjing("Beruang");
        semuaAnabul[2] = new Burung("Cicit");

        System.out.println("\nPerulangan melalui array Anabul:");
        for (Anabul anabul : semuaAnabul) {
            System.out.println("\nNama: " + anabul.getNama());
            anabul.Gerak();
            anabul.Bersuara();
        }
    }
}
