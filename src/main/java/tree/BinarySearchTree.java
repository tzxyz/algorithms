package tree;

import java.util.Iterator;
import java.util.Objects;
import java.util.Stack;

/**
 * Created by yesssssss on 2017/8/27.
 */
public class BinarySearchTree<K extends Comparable<K>, V> implements Iterable<V> {

    private static class Node<K, V> {
        private Node<K, V> left;
        private Node<K, V> right;
        private K key;
        private V value;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private Node<K, V> root;

    public V find(K key) {
        return find(key, root);
    }

    private V find(K key, Node<K, V> node) {
        if (Objects.isNull(node)) return null;
        int cmp = key.compareTo(node.key);
        if (cmp == 0) return node.value;
        else if (cmp < 0) return find(key, node.left);
        else return find(key, node.right);
    }

    public void insert(K key, V value) {
        insert(root, key, value);
    }

    private void insert(Node<K, V> node, K key, V value) {

        if (node == null) {
            this.root = new Node<>(key, value);
        } else {
            int cmp = key.compareTo(node.key);
            if (cmp < 0) {
                Node<K, V> left = node.left;
                if (left == null) {
                    node.left = new Node<>(key, value);
                } else {
                    insert(node.left, key, value);
                }
            } else if (cmp > 0 ){
                Node<K, V> right = node.right;
                if (right == null) {
                    node.right = new Node<>(key, value);
                } else {
                    insert(node.right, key, value);
                }
            } else {
                node.value = value;
            }
        }
    }

    public void middleIter() {
        middleIter(root);
    }

    private void middleIter(Node<K, V> node) {
        if (node == null) return;
        middleIter(node.left);
        System.out.println("value: " + node.value.toString());
        middleIter(node.right);
    }

    public void rightIter() {
        rightIter(root);
    }

    private void rightIter(Node<K, V> node) {
        if (node == null) return;
        rightIter(node.left);
        rightIter(node.right);
        System.out.println(node.value.toString());

    }

    public void leftIter() {
        leftIter(root);
    }

    private void leftIter(Node<K, V> node) {
        if (node == null) return;
        System.out.println(node.value.toString());
        leftIter(node.left);
        leftIter(node.right);
    }

    public void preOrderIterator() {
        Node<K, V> curr = root;

        Stack<Node<K, V>> stack = new Stack<>();
        stack.push(curr);

        while (!stack.empty()) {
            Node<K, V> node = stack.pop();
            System.out.println(node.value);
            if (node.right != null) stack.push(node.right);
            if (node.left  != null) stack.push(node.left);
        }

    }

    public void postOrderIterator() {
        Node<K, V> curr = root;

        Stack<Node<K, V>> stack = new Stack<>();

        stack.push(curr);

        while (!stack.empty()) {
            Node<K, V> node = stack.pop();
            if (node.right != null) stack.push(node.right);
            if (node.left  != null) stack.push(node.left);
            System.out.println(node.value.toString());
        }
    }

    public void middleOrderIteator() {
        Node<K, V> curr = root;

        Stack<Node<K, V>> stack = new Stack<>();

        stack.push(curr);

        while (!stack.empty()) {
            Node<K, V> node = stack.pop();
            if (node.right != null) stack.push(node.right);
            System.out.println(node.value.toString());
            if (node.left  != null) stack.push(node.left);
        }
    }

    private class PreOrderIterator implements Iterator<V> {

        Node<K, V> root;

        Stack<Node<K, V>> stack;

        public PreOrderIterator(Node<K, V> root) {
            this.root = root;
            this.stack = new Stack<>();
            stack.push(root);
        }

        @Override
        public boolean hasNext() {
            return root != null && !stack.empty();
        }

        @Override
        public V next() {

            Node<K, V> curr = stack.pop();
            Node<K, V> next = null;

            while (!stack.empty()) {
                next = stack.pop();
                if (next.left  != null) stack.push(next.left);
                if (next.right != null) stack.push(next.right);
            }

            return next == null ? null : next.value;
        }
    }

    @Override
    public Iterator<V> iterator() {
        return new PreOrderIterator(root);
    }
}
