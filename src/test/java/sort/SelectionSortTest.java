package sort;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SelectionSortTest {

    Integer[] ints = new Integer[1000];

    @Before
    public void init() {
        IntStream.range(0, 1000).map(i -> new Random().nextInt(1000)).boxed().collect(Collectors.toList()).toArray(ints);
    }

    @Test
    public void testSelectionSort() {
        System.out.println(Arrays.toString(ints));
        SelectionSort.selectionSort(ints);
        System.out.println(Arrays.toString(ints));
    }
}
