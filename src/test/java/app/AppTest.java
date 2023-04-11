import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AppTest {
    
    @Test
    public void testIsPrime() {
        // Test prime number
        assertTrue(App.isPrime(7));
      
        // Test non-prime number
        assertFalse(App.isPrime(6));
      
        // Test negative number
        assertFalse(App.isPrime(-2));
      
        // Test zero
        assertFalse(App.isPrime(0));
      
        // Test one
        assertFalse(App.isPrime(1));
    }
    
    @Test
    public void testMain() {
        // Prepare input
        String input = "1\n10\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Prepare output stream
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // Call main method
        App.main(null);

        // Get actual output
        String actualOutput = out.toString().trim();

        // Define expected output
        String expectedOutput = "Hello, World!\n" +
                "\nEnter the first number : " +
                "Enter the second number : " +
                "List of prime numbers between 1 and 10\n" +
                "2\n" +
                "3\n" +
                "5\n" +
                "7";


        // Check if actual output matches expected output
        assertEquals(expectedOutput, actualOutput);
    }
}
