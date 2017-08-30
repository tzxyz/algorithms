package sort;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ShellSortTest {

    Integer[] ints = new Integer[10000];

    @Before
    public void init() {
        IntStream.range(0, 10000).map(i -> new Random().nextInt(100000)).boxed().collect(Collectors.toList()).toArray(ints);
    }

    @Test
    public void testShellSort() {
        System.out.println(Arrays.toString(ints));
        ShellSort.shellSort(ints);
        System.out.println(Arrays.toString(ints));
    }
}
