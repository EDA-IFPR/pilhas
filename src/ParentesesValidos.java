import java.util.Map;
import java.util.Stack;

public class ParentesesValidos {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = Map.of(
                ')', '(',
                ']', '[',
                '}', '{'
        );

        for (int i = 0; i < s.length(); i++) {
            System.out.println("charachter: " + s.charAt(i));
            char caracter = s.charAt(i);
            if (map.containsKey(caracter)) {
                if (!stack.isEmpty()) {
                    if (stack.peek() == map.get(caracter)) {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                stack.push(caracter);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }
}
