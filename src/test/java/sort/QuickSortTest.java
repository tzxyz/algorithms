package sort;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class QuickSortTest {

    private BiFunction<Integer, Integer, Integer[]> function = (Integer range, Integer bound) -> IntStream.range(0, range).map(i -> new Random().nextInt(bound)).boxed().collect(Collectors.toList()).toArray(new Integer[range]);

    @Test
    public void quickSortTest() {

        for (int i = 0; i <= 1000; i++) {
            Integer result[] = function.apply(20, 100);
            System.out.println(String.format("第%s次排序", i));
            System.out.println(String.format("排序前: %s", Arrays.toString(result)));
            QuickSort.quickSort(result);
            System.out.println(String.format("排序后: %s", Arrays.toString(result)));
            System.out.println();
        }


    }

}
