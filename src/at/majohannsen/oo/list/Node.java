package at.majohannsen.oo.list;

public class Node<E extends Comparable<E>> {
    private E value;
    private Node next;

    public Node(E value) {
        this.value = value;
    }

    public E getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
