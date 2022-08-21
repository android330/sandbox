package com.revature.clash;

import java.util.Arrays;
import java.util.stream.Stream;

public class ClashOfCode10 {
    public static void main(String[] args) {
        String name = "asdf fiew JKAJS fkdk";
        String format = "camelCase";


        switch(format){
            case "camelCase":
                Stream<String> ss = Arrays.stream(name.split(" ")).map(s->s.toLowerCase());

                ss.map(s->{String d = ("" + s.charAt(0)).toUpperCase(); return d + s.substring(1);}).forEach(System.out::print);
                System.out.println();
                break;
            case "PascalCase":
                Stream<String> sb = Arrays.stream(name.split(" ")).map(s->s.toLowerCase());

                sb.map(s->{String d = ("" + s.charAt(0)).toUpperCase(); return d + s.substring(1);}).forEach(System.out::print);

                System.out.println();
                break;
            case "snake_case":
                System.out.println(name.replaceAll(" ", "_").toLowerCase());
                break;
        }
    }
}
