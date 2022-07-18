package com.revature.hackerRank;

import java.util.*;

public class HackerRank1 {
    public static void main(String[] args) {
        String s = "你好";
        System.out.println(s);
        int avg = (int) s.chars().average().orElse(0);

        s.chars().mapToObj(i->(char)i).forEach(System.out::println);

        System.out.println(avg);
    }
}
