package com.revature.clash;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ClashOfCode9 {
    public static void main(String[] args) {
        String num = "23";

        /*
        char[] n = num.toCharArray();
        int pro = 1;
        for(char c: n){
            pro *= Integer.parseInt(Character.toString(c));
        }
        */

        int pro = num.chars().reduce(1, (a,b)->a * (b - '0'));

        //num.chars().map(b->(b-'0')+2).forEach(System.out::println);
        System.out.println(pro);
    }
}
