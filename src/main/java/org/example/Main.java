package org.example;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ListTester tester1 = new ListTester(ArrayList.class);
        ListTester tester2 = new ListTester(LinkedList.class);

        String str = """
                |                |\t\t\tArrayList\t\t\t\t|\t\t\tLinkedList\t\t\t\t|
                |                |\tget\t\t|\tadd\t\t|\tremove\t|\tget\t\t|\tadd\t\t|\tremove\t|
                | execution time |\t%d\t\t|\t%d\t\t|\t%d\t\t|\t%d\t\t|\t%d\t\t|\t%d\t\t|
                | number of uses |\t%d\t|\t%d\t|\t%d\t|\t%d\t|\t%d\t|\t%d\t|
                """;

        System.out.printf(str, tester1.execTimeOfGet(10000),
                tester1.execTimeOfAdd(10000),
                tester1.execTimeOfRemove(10000),
                tester2.execTimeOfGet(10000),
                tester2.execTimeOfAdd(10000),
                tester2.execTimeOfRemove(10000),
                10000, 10000, 10000, 10000, 10000, 10000);
    }
}