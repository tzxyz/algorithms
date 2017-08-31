package sort;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MergeSortTest {

    Integer[] ints = new Integer[10];

    @Before
    public void init() {
        IntStream.range(0, 10).map(i -> new Random().nextInt(10)).boxed().collect(Collectors.toList()).toArray(ints);
    }

    @Test
    public void testShellSort() {
        System.out.println(Arrays.toString(ints));
        MergeSort.mergeSort(ints);
        System.out.println(Arrays.toString(ints));
    }
}
