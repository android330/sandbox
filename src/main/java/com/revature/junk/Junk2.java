package com.revature.junk;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class Junk2 {
    public static void main(String[] args) {
        int[] arr = {10,20,-30};

        int total = Arrays.stream(arr).reduce(0, (a,b)-> b % 2 == 0 ? a+b : a-b);

        System.out.println(total);


    }
}
