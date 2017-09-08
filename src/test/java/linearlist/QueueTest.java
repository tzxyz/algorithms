package linearlist;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;
import java.util.function.Supplier;

public class QueueTest {

    private Queue<Integer> queue = new Queue<>();
    private Supplier<Integer> generator = () -> new Random().nextInt(100);

    @Before
    public void init() {
        queue.enqueue(generator.get());
        queue.enqueue(generator.get());
        queue.enqueue(generator.get());
        queue.enqueue(generator.get());
        queue.enqueue(generator.get());
    }

    @Test
    public void test() {
        
        Integer i = queue.dequeue();
        System.out.println(i);
        i = queue.dequeue();
        System.out.println(i);
        i = queue.dequeue();
        System.out.println(i);
        i = queue.dequeue();
        System.out.println(i);
        i = queue.dequeue();
        System.out.println(i);
        
        System.out.println(queue.toString());
    }
}
