package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class WorkintechList<E extends Comparable<E>> extends ArrayList<E> {
    @Override
    public boolean add(E e) {
        if (contains(e)) {
            return false;
        }
        return super.add(e);
    }

    public void sort() {
        Collections.sort(this);
    }

    @Override
    public boolean remove(Object o) {
        boolean removed = super.remove(o);
        sort();
        return removed;
    }
}
