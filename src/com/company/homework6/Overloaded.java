package com.company.homework6;

public class Overloaded {

    static int sum() {
        int i = 0;
        System.out.println(i);
        return i;
    }

    int sum(int a) {
        System.out.println(a);
        return a;
    }

    int sum(int a, int b) {
        System.out.println(a + b);
        return a + b;
    }

    int sum(int a, int b, int c) {
        int i = a + b + c;
        System.out.println(i);
        return i;
    }

    int sum(int a,  int b, int c, int d) {
        int i = a + b + c + d;
        System.out.println(i);
        return i;
    }

    public static void main(String[] args) {
        Overloaded method = new Overloaded();
        sum();
        method.sum(2);
        method.sum(2, 3);
        method.sum(2, 4,5);
        method.sum(2, 6, 8,1);
    }
}
