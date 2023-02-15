package com.codegym;

import java.util.LinkedList;

public abstract class MemoryPool<T> {
    private LinkedList<T> tree_items = new LinkedList<>();

    public void freeItem(T item) {
        tree_items.add(item);
    }

    protected abstract T allocate();

    public T newItem(){
        T out = null;
        if (tree_items.size() == 0) {
            out = allocate();
        } else {
            out = tree_items.getFirst();
            tree_items.removeFirst();
        }
        return out;
    }
}
