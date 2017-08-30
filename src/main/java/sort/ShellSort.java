package sort;

public class ShellSort {


    public static <T extends Comparable<T>> void shellSort(T[] elements) {

        int gap = elements.length / 2;

        while (gap > 0) {
            for (int i = 0; i < elements.length; i += gap) {
                for (int j = i + gap; j < elements.length; j += gap) {
                    if (elements[i].compareTo(elements[j]) > 0) {
                        T tmp = elements[i];
                        elements[i] = elements[j];
                        elements[j] = tmp;
                    }
                }
            }

            gap = gap / 2;
        }
    }
}
