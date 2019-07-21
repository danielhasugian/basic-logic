import static org.junit.Assert.*;
import org.junit.Test;

import java.math.BigInteger;

public class FibonacciTest {

    @Test
    public void test() {
        BigInteger[] b = Fibonacci.generate(1,5);
        assertEquals(BigInteger.valueOf(5), b[b.length-1]);

        BigInteger[] c = Fibonacci.generate(10,2);
        assertEquals(BigInteger.valueOf(10), c[c.length-1]);
    }

}
