import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AnagramTest1 {
    
   @Test
   public void testPrintMessage() {
    assertEquals(true, AnagramChecker.check("care", "acre"));
   }
}