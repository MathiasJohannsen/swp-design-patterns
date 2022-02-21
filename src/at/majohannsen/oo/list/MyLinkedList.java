package at.majohannsen.oo.list;

public class MyLinkedList<E extends Comparable<E>> implements MyList<E> {
    protected Node<E> root = null;
    protected int size = 0;

    @Override
    public void add(E value) {
        if (root == null) {
            root = new Node(value);
        }
        else {
            Node p = root;
            while (p.getNext() != null) {
                p = p.getNext();
            }
            p.setNext(new Node(value));
        }
        size++;
    }

    @Override
    public void remove(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            root = root.getNext();
        }
        else {
            Node p = root;
            for (int i = 0; i < index-1; i++) {
                p = p.getNext();
            }
            p.setNext(p.getNext().getNext());
        }
        size--;
    }

    @Override
    public E get(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> p = root;
        for (int i = 0; i < index; i++) {
            p = p.getNext();
        }
        return p.getValue();
    }

    @Override
    public boolean contains(E value) {
        Node<E> p = root;
        while (p != null) {
            if (p.getValue() == value) {
                return true;
            }
            p = p.getNext();
        }
        return false;
    }

    public int size() {
        return size;
    }
}
