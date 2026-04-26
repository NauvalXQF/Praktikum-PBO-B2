public class Coercion {
    public static void main(String[] args) {

        // a. Polimorfisme coercion
        int intVal = 65;
        char B = (char) intVal;
        double C = (double) intVal;
        System.out.println("Nilai integer : " + intVal);
        System.out.println("Nilai char    : " + B);
        System.out.println("Nilai double  : " + C);
        System.out.println();

        // b. nilai real ke integer dalam variabel berbeda
        int nilaiAwal = (int) C;
        System.out.println("Nilai kembali ke integer: " + nilaiAwal);
        System.out.println();

        // c. Konkatenasi dan penjumlahan String integer
        String X = "1234";
        String Y = "5678";
        String S = X + Y;                                        
        int Z = Integer.parseInt(X) + Integer.parseInt(Y);      
        System.out.println("Nilai S (konkatenasi) : " + S);
        System.out.println("Nilai Z (penjumlahan) : " + Z);
        System.out.println();

        // d. Konkatenasi dan penjumlahan String double
        String P = "12.34";
        String Q = "56.78";
        String R = P + Q;                                        
        Double D = Double.parseDouble(P) + Double.parseDouble(Q); 
        System.out.println("Nilai R (konkatenasi) : " + R);
        System.out.println("Nilai D (penjumlahan) : " + D);
        System.out.println();

        // e. Integer A dari konversi nilai S
        Integer A = Integer.parseInt(S);
        System.out.println("Keluaran A: " + A);

        // f. String T dari konversi nilai A
        String T = A.toString();
        System.out.println("Keluaran T: " + T);
    }
}