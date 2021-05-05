/** ueb 15 - GGT Rekursiv
* 
* @author Simon Klasen & Andreas Scheuer
* @version 0.1
*/

public class GgtRekursiv implements GgT{

    /**
     * Methode berechneGgT implementiert aus Interface
     * 
     * @param a erste Zahl
     * @param b zweite Zahl
     * @return gibt ggT zurück
     */
    
    public long berechneGgt(long a, long b) {
        if (b == 0) {
            return a;
        } else {
            return berechneGgt(b, a % b);
        }
    }
}