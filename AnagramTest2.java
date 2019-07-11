import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AnagramTest2 {
    
   @Test
   public void testPrintMessage() {
    assertEquals(false, AnagramChecker.check("care1", "acre"));
   }
}