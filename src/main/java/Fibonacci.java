import java.math.BigInteger;

public class Fibonacci {

    /**
     * Generate Fibonacci based on initial value and how many loops
     * @param s Initial Value
     * @param l Loops
     * @return Array of Fibonacci
     */
    static BigInteger[] generate(int s, int l) {
        BigInteger[] r = new BigInteger[l];
        for (int x = 0; x < l; x++)
            r[x] = x < 2 ? BigInteger.valueOf(s) : r[x - 1].add(r[x - 2]);
        return r;
    }

}
