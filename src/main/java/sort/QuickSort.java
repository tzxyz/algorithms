package sort;

public class QuickSort {

    public static <T extends Comparable<T>> void quickSort(T[] elements) {
        quickSort(elements, 0, elements.length - 1);
    }

    private static <T extends Comparable<T>> void quickSort(T[] elements, int start, int end) {

        if (end - start <= 1) return;
        T pivot = pivot(elements, start, end);
        int i = start, j = end - 1;

        for (;;) {
            while (elements[i].compareTo(pivot) < 0) i++;
            while (elements[j].compareTo(pivot) > 0) j--;
            if (i < j) swap(elements, i, j);
            else break;
        }
        swap(elements, i, end);
        quickSort(elements, start, i - 1);
        quickSort(elements, i + 1, end);
    }

    private static <T extends Comparable<T>> T pivot(T[] element, int start, int end) {

        int center = (start + end) / 2;

        T left = element[0], middle = element[center], right = element[end];

        if (left.compareTo(middle) > 0)  swap(element, start, center);

        if (left.compareTo(right) > 0)   swap(element, start, end);

        if (middle.compareTo(right) > 0) swap(element, center, end);

        swap(element, center, end);

        return element[end];
    }

    private static <T> void swap(T[] array, int i, int j) {
        T t = array[i];
        array[i] = array[j];
        array[j] = t;
    }
}
