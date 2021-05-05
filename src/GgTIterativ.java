public class GgTIterativ implements GgT {

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