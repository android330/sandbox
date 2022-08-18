package com.revature.junk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Junk {
    public static void printHelper(String s, int index){
        if(index < s.length()){
            System.out.println(s.charAt(index));
            printHelper(s, index+1);
        }
    }

    public static void main(String[] args) {
        String helloWorld = "Hello World";

        printHelper(helloWorld, 0);


        int index = 0;
        while(index < helloWorld.length()){
            System.out.println(helloWorld.charAt(index));
            index++;
        }

        Integer [] arr = {10, 20, 30, 40, 50};

        Collections.reverse(Arrays.asList(arr));
        for(int i = 0 ; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        ArrayList a = new ArrayList();
        //a.stream().forEach(()->{});



    }
}
