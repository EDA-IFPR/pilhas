package pilhas_exercise;

public class ValidParentheses {
    public boolean isValid(String s) {
        String[] chars = s.split("");
        Pilha<String> pilha = new Pilha<>(null, 0);
        for (int i = 0; i < chars.length; i++) {
            if (chars[i].equals("(") ||
                    chars[i].equals("[") ||
                    chars[i].equals("{")) {
                pilha.push(chars[i]);
            } else {
                if (pilha.isEmpty()) {
                    return false;
                } else if (chars[i].equals(")") && pilha.topo.dado.equals("(") ||
                        chars[i].equals("]") && pilha.topo.dado.equals("[") ||
                        chars[i].equals("}") && pilha.topo.dado.equals("{")) {
                    pilha.pop();
                } else {
                    return false;
                }
            }
        }
        return pilha.isEmpty();
    }
}
