package linearlist;

import java.util.Arrays;

@SuppressWarnings("unchecked")
public class Stack<E> {

    private Object[] elements;

    private int position;
    private int capacity;

    public Stack() {
        this(16);
    }

    public Stack(int capacity) {
        this.capacity = capacity;
        this.elements = new Object[capacity];
    }

    public E peek() {
        return (E) elements[position-1];
    }

    public E pop() {
        if (position == 0) throw new ArrayIndexOutOfBoundsException("stack is empty!");
        return (E) elements[position--];
    }

    public boolean push(E element) {
        if (position == capacity) throw new ArrayIndexOutOfBoundsException("stack is full!");
        elements[position++] = element;
        return true;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(elements, 0, position));
    }
}
