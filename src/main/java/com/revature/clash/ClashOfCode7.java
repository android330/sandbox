package com.revature.clash;

import java.util.Arrays;
import java.util.List;

public class ClashOfCode7 {
    //output lowest odd number
    public static void main(String[] args) {
        String line = "1 2 3 4 5 6 7 8 23 54 63 56 2345 6";

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println("answer");

        String[] s = line.split(" ");
        int[] i = new int[line.length()];
        List ss = Arrays.asList(i);

        for(int z = 0; z < ss.size(); z++){
            if(Integer.parseInt(ss.get(z).toString())  % 2 == 1){
                System.out.println(i[z]);
            }
        }
    }
}
