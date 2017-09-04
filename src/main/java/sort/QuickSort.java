package sort;

import java.util.Arrays;

public class QuickSort {

    public static <T extends Comparable<T>> void quickSort(T[] elements) {
        pivot(elements);
    }

    public static <T extends Comparable<T>> void quickSort(T[] elements, int start, int end) {
        if (elements.length < 2) return;
//        elements
    }

    private static <T extends Comparable<T>> void pivot(T[] element) {
        int start = 0;
        int end = element.length - 1;
        int mid = (end - start) / 2;

        T left = element[0];
        T middle = element[mid];
        T right = element[end];

        if (left.compareTo(middle) > 0) {
            T tmp = left;
            left = middle;
            middle = tmp;
        }

        if (middle.compareTo(right) < 0) {
            T tmp = middle;
            middle = right;
            right = tmp;
        }

        System.out.println(String.format("start: %s, middle: %s, end: %s, elements: %s", left, middle, right, Arrays.toString(element)));
    }
}
