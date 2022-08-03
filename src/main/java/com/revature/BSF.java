package com.revature;

import java.util.ArrayList;
import java.util.Collections;

public class BSF {

    public static ArrayList<Integer> array;
    public static int BSF(int toFind, int upper, int lower){
        int midIndex = (int) Math.floor((upper - lower) / 2.0) + lower;
        int mid = array.get(midIndex);
        if(mid == toFind)
            return midIndex;
        else if(mid < toFind)
            return BSF(toFind, upper, midIndex);
        else
            return BSF(toFind, midIndex, lower);
    }

    public static void main(String[] args) {
        int[] i = {1,23,4,5,6,34,52345,235,5,6,23,345,36,90123,234,342,563,543};

        array = new ArrayList<>();
        for(int s: i){array.add(s);}
        Collections.sort(array);

        System.out.println(array);

        System.out.println(BSF(34, array.size()-1, 0));


    }


}
