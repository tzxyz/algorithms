package linearlist;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class StackTest {

    private Stack<Integer> stack = new Stack<>();
    private Supplier<Integer> generator = () -> new Random().nextInt(100);

    @Before
    public void init() {
        IntStream.range(0, 10).forEach(i -> {
            stack.push(generator.get());
            System.out.println(stack);
        });
    }

    @Test
    public void test() {
        for (int i = 0; i < 10; i++) {
            stack.pop();
            System.out.println(stack);
        }
    }

    @Test
    public void testEmpty() {
        for (int i = 0; i < 15; i++) {
            stack.pop();
            System.out.println(stack);
        }
    }

    @Test
    public void testFull() {
        for (int i = 0; i < 10; i++) {
            stack.push(generator.get());
            System.out.println(stack);
        }
    }

    @Test
    public void testPeek() {
        for (int i = 0; i < 10; i++) {
            Integer j = stack.peek();
            System.out.println(j);
            stack.pop();
        }
    }
}
