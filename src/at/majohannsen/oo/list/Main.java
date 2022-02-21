package at.majohannsen.oo.list;

public class Main {
    public static void main(String[] args) {
        MySortedLinkedList l = new MySortedLinkedList();
        l.add(2);
        l.add(3);
        l.add(0);
        l.add(5);
        l.add(2);
        l.remove(4);
        l.remove(1);
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
    }
}
