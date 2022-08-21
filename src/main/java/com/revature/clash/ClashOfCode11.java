package com.revature.clash;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

//determine date of birth by adding 27 days and 8 months past conception
public class ClashOfCode11 {
    public static void main(String[] args) {
        String s = "8/19/2022";
        String[] ss = s.split("/");
        List<Integer> l = new ArrayList<>();
        for(String f: ss)
            l.add(Integer.parseInt(f));

        Calendar c = Calendar.getInstance();

        c.set(Calendar.YEAR, l.get(2));
        c.set(Calendar.MONTH, l.get(0));
        c.set(Calendar.DATE, l.get(1));

        c.add(Calendar.DATE, 27);
        c.add(Calendar.MONTH, 8);

        System.out.println(c.get(Calendar.MONTH) + "/" + c.get(Calendar.DATE) + "/" + c.get(Calendar.YEAR));

        System.out.println(7 + 3);
        System.out.println("" + 7 + 3);
        System.out.println("" + (7 + 3)) ;

        System.out.println("" + 5 * 2);
    }
}
