package com.company.lesson_6;

public class MethodOverloading {
    void show(int i1) {
        System.out.println(i1);
    }

    void show(int i1, int i2) {
        System.out.println(i1 + i2);
    }

    void show(boolean b1) {
        System.out.println(b1);
    }

    void show(String s1) {
        System.out.println(s1);
    }
}

class MethodOverloadingTest {
    public static void main(String[] args) {
        MethodOverloading mO = new MethodOverloading();
        int a = 500;
        int c = 200;
        mO.show(a);
        boolean b = true;
        mO.show(b);
        String s="Privet!!!";
        mO.show(s);
        mO.show(a, c);
    }
}
