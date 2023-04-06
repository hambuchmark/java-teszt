import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest {

   @Test
   public void testIsPrime() {
      // Teszt prím számra
      assertTrue(App.isPrime(7));
      
      // Teszt nem prím számra
      assertFalse(App.isPrime(6));
      
      // Teszt negatív számra
      assertFalse(App.isPrime(-2));
      
      // Teszt nullára
      assertFalse(App.isPrime(0));
      
      // Test egyre
      assertFalse(App.isPrime(1));
   }
}
