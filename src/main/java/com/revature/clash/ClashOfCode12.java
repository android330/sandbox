package com.revature.clash;

import java.util.HashSet;

 /*
Input

aAabBc

Output

123121
*/

public class ClashOfCode12 {
    public static void main(String[] args) {
        String S = "aAabBc".toLowerCase();
        //System.err.println(S);

        for(int i = 0; i < S.length(); i++){
            String prev = S.substring(0, i);
            String curChar = "" + S.charAt(i);
            //System.err.print(curChar);
            String g = prev.replaceAll(curChar, "");
            //System.err.println(" " + g);
            System.out.print(prev.length() - g.length() + 1);

        }
        System.out.println();
    }
}
