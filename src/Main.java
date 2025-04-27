import java.util.ArrayList;
import java.util.Arrays;

import recursion.Recursion;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 5, 6, 8, 12, 15));
        System.out.println(Recursion.sum(3));
        System.out.println(Recursion.countSize(numbers));
        System.out.println(Recursion.maxValue(numbers));
        System.out.println(Recursion.binarySearch(numbers, 6, 0, numbers.size()));
    }
}