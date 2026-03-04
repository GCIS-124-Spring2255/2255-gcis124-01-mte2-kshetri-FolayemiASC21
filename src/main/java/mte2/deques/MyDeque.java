// Question: Q2 (mte2, gcis124, 2255)
// Package name: deques
// File name: MyDeque.java

package mte2.deques;

import java.util.LinkedList;
import java.util.Iterator;

// public class MyDeque {
public class MyDeque<E> implements Deque<E> {
    
    private final LinkedList<E> list;
    public int index;
    public MyDeque() {
        this.list = new LinkedList<>();
        this.index = 0;
    }

    public void enqueueFront(E value) {
        list.addFirst(value);
    }
    public void enqueueBack(E value) {
        list.add(value);
    }

    public E dequeueFront() {
        return list.removeFirst();
    }

    public E dequeueBack() {
        return list.removeLast();
    }

    public int size() {
        return list.size();
    }

    public boolean hasNext() {
        return list.get(index+1)!=null;
    }

    public Iterator<E> iterator() {
        while (hasNext()) {
        }
    }


    public static void main(String[] args) { 

        // ...
    }
}