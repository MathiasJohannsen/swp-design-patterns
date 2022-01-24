package at.majohannsen.oo.list;

public class MyLinkedList implements MyList {
    private Node root = null;
    private int size = 0;

    @Override
    public void add(int value) {
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
    public int get(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node p = root;
        for (int i = 0; i < index; i++) {
            p = p.getNext();
        }
        return p.getValue();
    }

    public int size() {
        return size;
    }
}
