package sort;

import java.util.Arrays;

public class MergeSort {


    public static void mergeSort(Integer[] elements) {
        mergeSort(elements, new Integer[elements.length], 0, elements.length - 1);
    }

    private static void mergeSort(Integer[] elements, Integer tmp[], int start, int end) {

        if (start < end) {
            int middle = (end + start) / 2;

            mergeSort(elements, tmp, start, middle);
            mergeSort(elements, tmp, middle + 1, end);

            merge(elements, tmp, start, middle, end);
        }
    }

    private static void merge(Integer[] elements, Integer[] templates, int start, int middle, int end) {

        System.out.println(String.format("start: %s, middle: %s, end: %s, elements: %s, templates: %s", start, middle, end, Arrays.toString(elements), Arrays.toString(templates)));

        int tmpIndex = start;
        int leftIndex = start;
        int rightIndex = middle + 1;

        while (leftIndex <= middle && rightIndex <= end) {

            try {
                if (elements[leftIndex] <= elements[rightIndex]) {
                    templates[tmpIndex++] = elements[leftIndex++];
                } else {
                    templates[tmpIndex++] = elements[rightIndex++];
                }
            } catch (Exception e) {
                System.out.println(String.format("left: %s, middle: %s, || right: %s, end: %s", leftIndex, rightIndex, middle, end));
                System.out.println(Arrays.toString(elements));
            }
        }

        while (leftIndex <= middle) templates[tmpIndex++] = elements[leftIndex++];
        while (rightIndex <= end) templates[tmpIndex++] = elements[rightIndex++];
        System.arraycopy(templates, start, elements, start, rightIndex - start);
    }
}
