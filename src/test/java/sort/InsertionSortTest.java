package sort;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InsertionSortTest {

    Integer[] ints = new Integer[100];

    @Before
    public void init() {
        IntStream.range(0, 100).map(i -> new Random().nextInt(500)).boxed().collect(Collectors.toList()).toArray(ints);
    }

    @Test
    public void testInsertionSort() {
        System.out.println(Arrays.toString(ints));
        InsertionSort.insertionSort(ints);
        System.out.println(Arrays.toString(ints));
    }
}
