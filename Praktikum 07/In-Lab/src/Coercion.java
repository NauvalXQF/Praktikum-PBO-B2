public class Coercion {
    public static void main(String[] args) {

        int A = 65;
        char B = (char) A;
        double C = (double) B;
        int nilaiAwal = (int) C;

        System.out.println("nilai A :" + A);
        System.out.println("Nilai B: " + B);
        System.out.println("Nilai C: " + C);
        System.out.println("nilai Awal: " + nilaiAwal);
        System.out.println();

        String X = "1234";
        String Y = "5678";
        String S = X + Y;
        int Z = Integer.parseInt(X) + Integer.parseInt(Y);

        System.out.println("Nilai S: " + S);
        System.out.println("Nilai Z: " + Z);
        System.out.println();



        String P = "12.34";
        String Q = "56.78";
        String R = P + Q;
        Double D = Double.parseDouble(P) + Double.parseDouble(Q);

        System.out.println("Nilai R: " + R);
        System.out.println("Nilai D: " + D);
        System.out.println();


        Integer O = Integer.parseInt(S);
        String T = O.toString();

        System.out.println("keluaran O: " + O);
        System.out.println("keluaran T " + T);
    }
}
