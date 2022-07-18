package com.revature.clash;

public class ClashOfCode6 {

    // this was not a clash of code challenge, its just that today I have seen 10 people talk about inverting a string
    public static void main(String[] args) {
        String s = "Invert A String";

        /*
        StringBuilder sb = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; i--){
            sb.append(s.charAt(i));
        }
        System.out.println(sb);
        */

        System.out.println(new StringBuilder(s).reverse());
    }
}
