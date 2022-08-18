package com.revature.junk;

import java.util.*;

public class junk1 {
    public static void main(String[] args) {
        int[] arr = {0, 2,3,6, 7,0,  2 ,7 ,3, 3, 3, 3, 3};

        /*
        int dup = 0;
        for(int i = 0; i < arr.length; i++){
            int toCheck = arr[i];
            if(toCheck == Integer.MIN_VALUE)
                continue;
            for(int x = i + 1; x < arr.length; x++){
                //System.out.println(toCheck + " " + arr[x]);
                if(toCheck == arr[x]) {
                    arr[x] = Integer.MIN_VALUE;
                    dup++;
                }
            }
        }
        System.out.println(dup);
        */

/*
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int i: arr)
            hs.add(i);
        System.out.println(arr.length - hs.size());

 */


        List<String> list = new ArrayList<>();

        list.add("asdfasdfasdf");
        list.add("asdfijvni");
        list.add("asdfio");
        list.add("939u9u9ad9");

        Collections.sort(list, (o1, o2) -> o2.length() - o1.length());

        System.out.println(list);

        LinkedList<Integer> ll = new LinkedList<>();

        System.out.println(list.stream().reduce("", (a,b)-> String.valueOf(a.length() + b.length())));


    }
}
