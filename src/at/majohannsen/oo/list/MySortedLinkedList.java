package at.majohannsen.oo.list;

public class MySortedLinkedList<E extends Comparable<E>> extends MyLinkedList<E> {
    @Override
    public void add(E value) {
        if (root == null) {
            root = new Node<E>(value);
        }
        else {
            Node<E> p = root;
            if (p.getValue().compareTo(value) >= 0) {
                root = new Node<E>(value);
                root.setNext(p);
                size++;
                return;
            }
            while (p.getNext() != null) {
                if (p.getNext().getValue().compareTo(value) >= 0) {
                    Node<E> n = new Node<E>(value);
                    n.setNext(p.getNext());
                    p.setNext(n);
                    size++;
                    return;
                }
                else {
                    p = p.getNext();
                }
            }
            p.setNext(new Node(value));
        }
        size++;
    }
}
