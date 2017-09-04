package sort;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class QuickSortTest {

    private Integer[] ints = new Integer[10];

    @Before
    public void init() {
        IntStream.range(0, 10).map(i -> new Random().nextInt(100)).boxed().collect(Collectors.toList()).toArray(ints);
    }

    @Test
    public void quickSortTest() {
        System.out.println(Arrays.toString(ints));
        QuickSort.quickSort(ints);
        System.out.println(Arrays.toString(ints));
    }

}
