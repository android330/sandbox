package com.revature.clash;

public class ClashOfCode8 {
    public static void main(String[] args) {
        //System.gc();

        int n = 15642;

        int sum = 1;
        while(n >= 10){
            sum *= n % 10;
            //System.out.println(sum);
            n/=10;
        }
        System.out.println(sum );

        String[] a = {"a"};

    }
}
