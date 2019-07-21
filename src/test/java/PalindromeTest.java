import static org.junit.Assert.*;
import org.junit.Test;

public class PalindromeTest {

    @Test
    public void test() {
        boolean a = Palindrome.isTrue("HDHDHDHDH");
        assertTrue(a);

        boolean b = Palindrome.isTrue("DHDHDHDH");
        assertFalse(b);

        boolean c = Palindrome.isTrue(null);
        assertFalse(c);
    }

}
