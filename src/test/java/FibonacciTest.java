import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;

public class FibonacciTest {

    @Test
    public void test() {
        BigInteger[] b = Fibonacci.fibonacci(1,5);
        Assert.assertEquals(BigInteger.valueOf(5), b[b.length-1]);

        BigInteger[] c = Fibonacci.fibonacci(10,2);
        Assert.assertEquals(BigInteger.valueOf(10), c[c.length-1]);
    }

}
