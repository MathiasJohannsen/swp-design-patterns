package at.majohannsen.oo.list;

public interface MyList<E extends Comparable<E>>{
    public void add(E value);
    public void remove(int index);
    public E get(int index);
    public boolean contains(E value);
}
