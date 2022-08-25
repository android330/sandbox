package com.revature.clash;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class clashOfCode14 {
    public static void main(String[] args) {
        Integer[] iArray = {1,3,4,7,13,14};

        List<Integer> l = Arrays.asList(iArray);

        System.out.println(l.stream().reduce(Integer::sum).get());

        l.subList(0,3).stream().reduce(Integer::sum).ifPresent(System.out::println);




        l.stream().filter(a -> a >= 3  && a <= 13).reduce(Integer::sum).ifPresent(System.out::println);

        l.stream().reduce(Integer::max).ifPresent(System.out::println);


        System.out.println(l.stream().collect(StringBuilder::new, (a, b) -> a.append(b), (x, y) -> x.append("z").append(y)).toString());

        // l.stream().collect(Integer(0), Integer::sum, Integer::sum);

        l.stream().peek(a -> a *= 2).forEach(a->System.out.print(a+" "));

        //Collections.sort(l);


        float f = 2830919.232412f;
        char c = (char) Math.ceil(f% 127);
        System.out.println(c);

        String s = "27389";
        // int i1 = Integer.getInteger(s);
        Integer i2 = 9 ;

        boolean a = true;
        // a = (boolean) c;


    }
}
