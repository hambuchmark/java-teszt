import org.junit.Test;
import static org.junit.Assert.*;

public class TestApp {
    
    @Test
    public void testIsPrime() {
        assertFalse(App.isPrime(1));
        assertTrue(App.isPrime(2));
        assertTrue(App.isPrime(3));
        assertFalse(App.isPrime(4));
        assertTrue(App.isPrime(5));
        assertFalse(App.isPrime(6));
        assertTrue(App.isPrime(7));
        assertFalse(App.isPrime(8));
        assertFalse(App.isPrime(9));
        assertFalse(App.isPrime(10));
        assertTrue(App.isPrime(11));
    }
}
