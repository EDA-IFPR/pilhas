package pilhas_exercise;

public class Pilha<T> {
    No<T> topo;
    int tamanho;

    public Pilha(No<T> topo, int tamanho) {
        this.topo = topo;
        this.tamanho = tamanho;
    }

    void push(T dado) {
        No<T> novoNo = new No<T>(dado, topo);
        topo = novoNo;
        tamanho++;
    }

    T pop() {
        if (topo != null) {
            T dado = topo.dado;
            topo = topo.proximo;
            tamanho--;
            return dado;
        } else {
            System.out.println("Pilha vazia!");
            return null;
        }
    }

    T peek() {
        if (topo != null) {
            return topo.dado;
        } else {
            System.out.println("Pilha vazia!");
            return null;
        }
    }

    boolean isEmpty() {
        return topo == null;
    }
    
}

class No<T> {
    T dado;
    No<T> proximo;

    public No(T dado, No<T> proximo) {
        this.dado = dado;
        this.proximo = proximo;
    }
}
