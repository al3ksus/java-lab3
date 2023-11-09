package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTester {

    private List<Integer> list;

    public ListTester(Class<? extends List> c) {
        if (c.equals(ArrayList.class)) {
            list = new ArrayList<>();
        } else if (c.equals(LinkedList.class)) {
            list = new LinkedList<>();
        }
    }

    public long execTimeOfGet(int num) {
        fill(num);
        long time = System.currentTimeMillis();

        for (int i = 0; i < num; i++) {
            list.get(i);
        }

        long result = System.currentTimeMillis() - time;
        list.clear();
        return result;
    }

    public long execTimeOfAdd(int num) {
        long time = System.currentTimeMillis();

        for (int i = 0; i < num; i++) {
            list.add(i);
        }

        long result = System.currentTimeMillis() - time;
        list.clear();
        return result;
    }

    public long execTimeOfRemove(int num) {
        fill(num);
        long time = System.currentTimeMillis();

        for (int i = 0; i < num; i++) {
            list.remove(list.size() / 2);
        }

        return System.currentTimeMillis() - time;
    }

    public void fill(int count) {
        for (int i = 0; i < count; i++) {
            list.add(i);
        }
    }
}
