package about.iterator.own;

import java.util.Iterator;

public class SimpleIterator<E> implements Iterator<E> {
    private E[] objects;
    private int index = 0;

    public SimpleIterator(E[] objects) {
        this.objects = objects;
    }

    @Override
    public boolean hasNext() {
        return index < objects.length;
    }

    @Override
    public E next() {
        return objects[index++];
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[] {1, 2, 4, 5};

        SimpleIterator<Integer> iterator = new SimpleIterator<>(arr);

        while (iterator.hasNext()) {
            int element = iterator.next();
            System.out.println("Element: " + element);
        }
    }
}
