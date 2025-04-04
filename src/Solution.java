import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] array = s.toCharArray();

        for(int i = 0; i < array.length; i++) {
            if(array[i] == '(' || array[i] == '[' || array[i] == '{') {
                stack.push(array[i]);
            } else {
                if(stack.isEmpty() || !isMatching(stack.pop(), array[i])) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean isMatching(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '[' && close == ']') ||
               (open == '{' && close == '}');
    }
}