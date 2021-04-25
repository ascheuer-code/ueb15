
public class GGT {
    /**
     * ggT nach dem euklidischen Algorithmus berechnen
     * 
     * @param first,second ganze Zahlen
     * @return der berechnete ggT
     */
    public static long iterativ(long first, long second) {

        long third = first % second;

        while (third > 0) {
            first = second;
            second = third;
            third = first % second;
        }
        return second;
    }

}
