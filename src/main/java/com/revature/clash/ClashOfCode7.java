package com.revature.clash;

import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class ClashOfCode7 {
    // output lowest odd number
    // i was going to solve this one correctly, but i missclicked and submitted early
    public static void main(String[] args) {
        String line = "4 2 11 4 94 6 33 8 23 54 63 56 2345 6";

        String[] s = line.split(" ");
        List<Integer> l = new ArrayList<>();
        for(String s1: s){
            l.add(Integer.parseInt(s1));
        }
        Collections.sort(l);

        for(int x: l){
            if(x % 2 == 1){
                System.out.println(x);
                break;
            }
        }
    }
}
