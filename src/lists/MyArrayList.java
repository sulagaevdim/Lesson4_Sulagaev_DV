package lists;

import java.util.Iterator;

public class MyArrayList<E extends Comparable<E>> implements MyList<E>{
    private E[] values;
    private int index;
    private int size;
    private int capasity;
    @SuppressWarnings("unchecked")
    public MyArrayList() {
        this.index = 0;
        this.size = 0;
        this.capasity = 10;
        try {
            this.values = (E[]) new Comparable[capasity];
        } catch (ClassCastException e) {
            e.printStackTrace();
        };

    }
    private void addCapacity() {
        E[] temp = (E[]) new Comparable[capasity + capasity/2];
        System.arraycopy(values, 0, temp, 0, values.length);
        values = temp;

    }
    @Override
    public void add(E element) {
        if (size == capasity) addCapacity();
        values[size] = element;
        size++;
    }

    @Override
    public void delete(int index) {
        E[] temp = (E[]) new Comparable[capasity-1];
        System.arraycopy(values, 0, temp, 0, index);
        int amountElementsAfterIndex = temp.length - index - 1;
        System.arraycopy(values, index+1, temp, index, amountElementsAfterIndex);
        values = temp;
        size--;

    }

    @Override
    public void delete(E element) {
        for (int i = 0; i < values.length; i++) {
            E el = values[i];
            if (el.equals(element)) delete(i);
        }

    }

    @Override
    public E get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            @Override
            public boolean hasNext() {
                return index<values.length;
            }

            @Override
            public E next() {
                return values[index++];
            }
        };
    }

    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            builder.append(values[i]).append(", ");
        }
        if (builder.length() == 1) return "[]";
        builder.deleteCharAt(builder.length() - 1).deleteCharAt(builder.length() -1);
        builder.append("]");
        return builder.toString();
    }
}
