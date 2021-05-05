/** ueb 15 - GGT Iterativ
* 
* @author Simon Klasen & Andreas Scheuer
* @version 0.1
*/

public class GgTIterativ implements GgT {

    /**
     * Methode berechneGgT implementiert aus Interface
     * 
     * @param a erste Zahl
     * @param b zweite Zahl#
     * @return gibt ggT zurück
     */

    public long berechneGgt(long a, long b) {
        long x = a;
        long y = b;

        if (a == 0) {
            return b;
        }
        while (y != 0) {
            if (x > y) {
                x -= y;
            } else {
                y -= x;
            }
        }
        return x;
    }
}