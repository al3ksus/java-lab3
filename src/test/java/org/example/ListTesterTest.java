package org.example;

import org.example.ListTester;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListTesterTest {

    ListTester tester1;
    ListTester tester2;

    @BeforeEach
    void setup() {
        tester1 = new ListTester(ArrayList.class);
        tester2 = new ListTester(LinkedList.class);
    }

    @Test
    void execTimeOfGet() {
        Assertions.assertTrue(tester1.execTimeOfGet(10000) < tester2.execTimeOfGet(10000));
    }

    @Test
    void execTimeOfRemove() {
        Assertions.assertTrue(tester1.execTimeOfRemove(10000) < tester2.execTimeOfRemove(10000));
    }
}
