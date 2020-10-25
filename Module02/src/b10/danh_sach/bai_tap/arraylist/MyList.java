package b10.danh_sach.bai_tap.arraylist;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) throws IllegalAccessException {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalAccessException("capacity" + capacity);
        }
    }

    public int size() {
        return this.size;
    }

    public void clean() {
        this.size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    public boolean add(E element) throws IllegalAccessException {
        if (elements.length == size) {
            this.ensureCapacity(1);
        }
        elements[size] = element;
        size++;
        return true;
    }

    private void ensureCapacity(int minCapacity) throws IllegalAccessException {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IllegalAccessException("minCapacity" + minCapacity);
        }
    }

    public void add(E element, int index) throws IllegalAccessException {
        if (index > elements.length) {
            throw new IllegalAccessException("index" + index);
        } else if (elements.length == size) {
            this.ensureCapacity(5);
        }

        if (elements[index] == null) {
            elements[index] = element;
            size++;
        } else {
            for (int i = size + 1; i >= index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }
    }

    public E get(int i) {
        return (E) elements[i];
    }

    public int indexOf(E o) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(o)) {
                return i;
            }
        }
        return index;
    }

    public boolean contains(E o){
        return this.indexOf(o) >= 0;
    }

    public MyList clone(){
        MyList clone = new MyList();
        clone.elements = Arrays.copyOf(this.elements, size);
        clone.size = this.size;
        return clone;
    }

    public E remove(int index) throws IllegalAccessException {
        if(index<0 || index> elements.length){
            throw  new IllegalAccessException("index" + index);
        }
        E element = (E) elements[index];
        for (int i = 0; i < size-1; i++) {
            elements[i] = elements[i+1];
        }
        elements[size-1] = null;
        size--;
        return element;
    }
}
