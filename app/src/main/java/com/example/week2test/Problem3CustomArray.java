package com.example.week2test;

public class Problem3CustomArray {

    private int size;     // number of elements
    private Object[] elements;

    public Problem3CustomArray() {
        elements = new Object[8];  // allocate initial capacity of 10
        size = 0;
    }

    public void add(Object object) {
        if (size < elements.length) {
            elements[size] = object;
        } else {
            resize();
        }
        ++size;
    }

    public Object get(int index) {
        if (index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        return elements[index];
    }

    public int size() { return size; }

    public void resize() {
        Object[] arrayResize = new Object[elements.length*2];
        for(int i = 0; i < elements.length; i++) {
            arrayResize[i] = elements[i];
        }
        elements = arrayResize;
    }

}