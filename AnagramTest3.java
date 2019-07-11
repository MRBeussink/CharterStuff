import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AnagramTest3 {
	
   @Test
   public void testPrintMessage() {
    assertEquals(false, AnagramChecker.check("care", "acre1"));
   }
}