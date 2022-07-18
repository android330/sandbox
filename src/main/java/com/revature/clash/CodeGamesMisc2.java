package com.revature.clash;

import java.util.Scanner;

public class CodeGamesMisc2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String MESSAGE = in.nextLine();




        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < MESSAGE.length(); i++){
            char m = MESSAGE.charAt(i);
            //int count = 7;
            StringBuilder s1 = new StringBuilder();
            while(m > 0){
                s1.append(m % 2== 0 ? 0 : 1);
                m/=2;
            }
            System.err.println(s1.length());
            while(s1.length() < 7){
                s1.append("0");
            }
            System.err.println(s1);
            sb.append(s1.reverse());

        }
        String s = sb.toString();
        System.err.println(s);

        char prev = s.charAt(0);
        System.out.print(prev == '1' ? "0 0" : "00 0");

        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == prev){
                System.out.print('0');
            }else{
                System.out.print(s.charAt(i) == '1' ? " 0 0" : " 00 0");
                prev = s.charAt(i);
            }
        }

        System.out.println();



    }
}
