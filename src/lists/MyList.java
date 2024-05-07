package lists;

public interface MyList<T extends Comparable<T>> extends Iterable<T>{
    public abstract void add(T element);
    public abstract void delete(int index);
    void delete(T element);
    T get (int index);
    int size();
}
