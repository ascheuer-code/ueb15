public class GgtRekursiv implements GgT{

    public GgtRekursiv() {
    }

    public long berechneGgt(long a, long b) {
        if (b == 0) {
            return a;
        } else {
            return berechneGgt(b, a % b);
        }
    }
}