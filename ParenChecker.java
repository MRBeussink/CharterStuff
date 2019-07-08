import java.util.Stack;

public class ParenChecker {

    String parens;

    public static boolean checkParens(String parens) {
        Stack<Character> stack = new Stack();
        
        for (int i = 0; i < parens.length(); i++) {
            if (parens.charAt(i) == '(') {
                stack.push(parens.charAt(i));
            } else {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
            // System.out.println(stack.size());
        }

        return (stack.isEmpty());
    }
}