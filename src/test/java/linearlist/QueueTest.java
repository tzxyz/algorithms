package linearlist;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class QueueTest {

    private Queue<Integer> queue = new Queue<>();
    private Supplier<Integer> generator = () -> new Random().nextInt(100);

    @Before
    public void init() {
        IntStream.range(0, 100).forEach(i -> {
            queue.enqueue(generator.get());
            System.out.println(queue);
        });
    }

    @Test
    public void test() {
        IntStream.range(0, 100).forEach(i -> {
            queue.dequeue();
            System.out.println(queue);
        });
    }
}
