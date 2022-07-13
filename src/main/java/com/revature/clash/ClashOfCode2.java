package com.revature.clash;

public class ClashOfCode2 {
    public static void main(String[] args) {
        String in = ">1G <3H <5Q >7E <3R";

        String[] charAr = in.split(" ");

        for(String s : charAr){
            int dis = s.charAt(1) - 48;
            if(s.charAt(0) == '<'){
                System.out.print((char) (s.charAt(2) - dis));
            }else{
                System.out.print((char) (s.charAt(2) + dis));
            }
        }

        System.out.println();
    }
}
