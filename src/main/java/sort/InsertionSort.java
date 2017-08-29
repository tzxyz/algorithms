package sort;

public class InsertionSort {

    public static <T extends Comparable<T>> void insertionSort(T[] elements) {

        for (int i = elements.length - 1; i >= 0; i--) {

            for (int j = i - 1; j >= 0; j--) {
                if (elements[j].compareTo(elements[i]) > 0) {
                    T tmp = elements[j];
                    elements[j] = elements[i];
                    elements[i] = tmp;
                }
            }

        }

    }

}
