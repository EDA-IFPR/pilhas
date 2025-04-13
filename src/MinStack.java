import java.util.Stack;

public class MinStack {

    private Stack<Integer> stackPrincipal;
    private Stack<Integer> stackMinimos;

    public void push(int valor) {
        stackPrincipal.push(valor);
        if (stackMinimos.isEmpty() || valor < stackMinimos.peek()) {
            stackMinimos.push(valor);
        }
    }

    public void pop() {
        if (stackPrincipal.isEmpty()) return;
        int topoStackPrincipal = stackPrincipal.pop();
        if (stackMinimos.peek() == topoStackPrincipal) {
            stackMinimos.pop();
        }
    }

    public int top() {
        return stackPrincipal.peek();
    }

    public int getMinimo() {
        return stackMinimos.peek();
    }
}
