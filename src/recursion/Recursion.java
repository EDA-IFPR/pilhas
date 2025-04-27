package recursion;

import java.util.List;

public class Recursion {
    public static int sum(int maxValue) {
        if(maxValue == 1) {
            return 1;
        }
        return maxValue + sum(maxValue - 1);
    }

    public static int countSize(List<Integer> list) {
        if(list.size() == 1) {
            return 1;
        }
        return 1 + countSize(list.subList(1, list.size()));
    }

    public static int maxValue(List<Integer> list) {
        if(list.size() == 1) {
            return list.getFirst();
        } else {
            int first = list.getFirst();
            int max = maxValue(list.subList(1, list.size()));
            return Math.max(first, max);
        }
    }

    public static int binarySearch(List<Integer> list, int number, int start, int end) {
        if(start > end) {
            return -1;
        }

        int middle = start + (end - start) / 2;
        if(list.get(middle) == number) {
            return middle;
        } else if(list.get(middle) > number) {
            return binarySearch(list, number, start, middle - 1);
        } else {
            return binarySearch(list, number, middle + 1, end);
        }
    }
}
