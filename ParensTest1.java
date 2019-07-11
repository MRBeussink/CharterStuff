import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ParensTest1 {
    
    String parens = "(())";
    
   @Test
   public void testPrintMessage() {
        assertEquals(true, ParenChecker.checkParens(parens));
   }
}