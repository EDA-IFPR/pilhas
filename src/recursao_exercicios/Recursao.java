package exercises;

import java.util.ArrayList;
import java.util.List;

public class Recursao {
    static int somaRecursiva(int num) {
        if (num == 0) {
            return 0;
        }
        return num + somaRecursiva(num - 1);
    }

    // função que contém o número de itens em uma lista recursiva
    int contagemRecursiva(List<Integer> lista_r) {
        if(lista_r.size() == 0) {
            return 0;
        }
        lista_r.remove(lista_r.size() - 1);
        List<Integer> newList = lista_r;
        return 1 + contagemRecursiva(newList);
    }

    // função que encontra o maior valor em uma lista recursiva
    Integer maiorValorListaRecursao(List<Integer> lista_r) {
        if (lista_r.size() == 0) {
            return 0;
        }

        int maiorValor = lista_r.get(lista_r.size() - 1);
        lista_r.remove(lista_r.size() - 1);
        List<Integer> newList = lista_r;
        return Math.max(maiorValor, maiorValorListaRecursao(newList));
    }

    public static void main(String[] args) {
        Recursao r = new Recursao();
        // System.out.println(somaRecursiva(5));
        List<Integer> numeros = new ArrayList<>();
        numeros.add(17);
        numeros.add(55);
        numeros.add(21);
        System.out.println(r.maiorValorListaRecursao(numeros));
    }
}
