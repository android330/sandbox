package com.revature.clash;

public class ClashOfCode13 {
    public static void main(String[] args) {
        // swap characters in string
        String a = "^";
        String b = "*";
        String input = "^*^^^****^^^^**^^***^";

        System.out.println(input.replaceAll("\\*", "9"));

        System.err.println(a);
        input = input.replaceAll("\\" + a, "H");
        System.err.println(input);
        input = input.replaceAll("\\" + b, a);
        System.err.println(input);
        input = input.replaceAll("H", b);

        System.out.println(input);
    }
}
