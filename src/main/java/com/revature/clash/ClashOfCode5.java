package com.revature.clash;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClashOfCode5 {
    public static void main(String[] args) {
        String MESSAGE = "The Goal is 1 to Replace 0 the number 42 remainder with Buzz and other 8 with Lightning";

        // try 1
        /*
        String[] mes = MESSAGE.split(" ");
        for(String s: mes){
            try{
                if(Integer.parseInt(s) % 2 != 0){
                    s = "Lightning";
                }else{
                    s = "Buzz";
                }

            }catch(Exception e){}finally{
                System.out.print(s);
                if(s != mes[mes.length-1])
                    System.out.print(" ");
            }
        }

         */

        // try 2
        /*
        StringBuilder sb = new StringBuilder();
        String[] sa = MESSAGE.split(" ");
        Arrays.stream(sa).forEach(a->{
            try{
                int i = Integer.parseInt(a);
                a = i % 2 != 0 ? "Lightning" : "Buzz";
            }catch(Exception e){}finally {
                System.out.print(a + " ");
            }
        });
         */

        // try 3
        Matcher matcher = Pattern.compile("\\d+").matcher(MESSAGE);
        StringBuffer sb = new StringBuffer();
        while(matcher.find()){
            matcher.appendReplacement(sb, (Integer.parseInt(matcher.group()) % 2 != 0 ? "Lightning" : "Buzz"));
        }
        matcher.appendTail(sb);
        System.out.println(sb);

        // try 4?!?!?!?

    }
}
