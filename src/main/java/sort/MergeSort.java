package sort;

import java.util.Arrays;

public class MergeSort {


    public static void mergeSort(Integer[] elements) {
        mergeSort(elements, 0, elements.length - 1);
    }

    private static void mergeSort(Integer[] elements, int start, int end) {

        System.out.println(String.format("start: %s, end: %s", start, end));

        if (end - start <= 1) return;
        else {
            if (elements.length > 0) {
                // 不包含尾
//                System.out.println(Arrays.toString(Arrays.copyOfRange(elements, start, end + 1)));
            }
        }

        int middle = (end - start) / 2;

        mergeSort(elements, start, middle);
        mergeSort(elements, middle + 1, end);

        merge(elements, start, middle, end);
    }

    private static void merge(Integer[] elements, int start, int middle, int end) {
        // 分配一个新数组
        Integer[] templates = new Integer[elements.length];

        int m = middle + 1;
        int t = start;
        int c = start;

        while (start <= middle && middle + 1 <= end) {
            try {
                if (elements[start] - elements[m] < 0) {
                    templates[t++] = elements[start++];
                } else {
                    templates[t++] = elements[m++];
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(String.format("%s, %s, %s", start, middle, end));
            }
        }

        while (start <= middle) templates[t++] = elements[start++];
        while (m <= end) templates[t++] = elements[m ++];

        System.arraycopy(templates, 0, elements, 0, elements.length);
    }
}
