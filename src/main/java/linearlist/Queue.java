package linearlist;

public class Queue<E> {

    private transient Node<E> head;
    private transient Node<E> tail;

    private static class Node<E> {
        Node<E> next;
        E value;

        public Node(E value) {
            this.value = value;
        }
    }

    public boolean enqueue(E e) {

        if (head == null) {
            head = new Node<>(e);
            if (tail == null) tail = head;
        } else {
            Node<E> node = new Node<>(e);
            tail.next = node;
            tail = node;
        }

        return true;
    }

    public E dequeue() {

        Node<E> node = head;

        if (node != null) head = head.next;

        return node == null ? null : node.value;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Queue[");
        for (Node<E> node = head; node != null && node.value != null; node = node.next) {
            builder.append(node.value);
            if (node.next != null) builder.append(",");
        }
        builder.append("]");
        return builder.toString();
    }
}