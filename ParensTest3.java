import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ParensTest3 {
    
    String parens = "())";
    
   @Test
   public void testPrintMessage() {
        assertEquals(false, ParenChecker.checkParens(parens));
   }
}