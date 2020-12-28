package com.company.homework4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {
    public static void main (String[] args) throws java.lang.Exception
    {
        int max = 10_000_000;
        Random random = new Random();
        List<String> list = new ArrayList<>(max);
        for (int i = 0; i < max; i++)
            list.add(String.valueOf(random.nextInt(20_000)));

        long t1=System.currentTimeMillis();
        list.stream().sorted();
        long t2=System.currentTimeMillis();

        System.out.println("millis (|): " + (t2-t1));

        long t3=System.currentTimeMillis();
        list.parallelStream().sorted();
        long t4=System.currentTimeMillis();

        System.out.println("millis (||): " + (t4-t3));
    }
}
