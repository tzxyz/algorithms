package sort;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MergeSortTest {

    private Integer[] ints = new Integer[30];

    @Before
    public void init() {
        IntStream.range(0, 30).map(i -> new Random().nextInt(100)).boxed().collect(Collectors.toList()).toArray(ints);
    }

    @Test
    public void testMergeSort() {
        System.out.println(Arrays.toString(ints));
        MergeSort.mergeSort(ints);
        System.out.println(Arrays.toString(ints));
    }

}
