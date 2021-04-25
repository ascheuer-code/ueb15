
public class BerechneGGT {
    /**
     * ggT nach dem euklidischen Algorithmus berechnen
     * 
     * @param m, n ganze Zahlen
     * @return der berechnete ggT
     */
    public static long ggT(long m, long n) {

        long third = m % n;

        while (third > 0) {
            m = n;
            n = third;
            third = m % n;
        }
        return n;
    }
}
