package at.majohannsen.oo.list;

public class MySortedLinkedList extends MyLinkedList {
    @Override
    public void add(int value) {
        if (root == null) {
            root = new Node(value);
        }
        else {
            Node p = root;
            if (p.getValue() >= value) {
                root = new Node(value);
                root.setNext(p);
                size++;
                return;
            }
            while (p.getNext() != null) {
                if (p.getNext().getValue() >= value) {
                    Node n = new Node(value);
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
