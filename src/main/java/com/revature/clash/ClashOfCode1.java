package com.revature.clash;

import java.util.Arrays;
import java.util.stream.DoubleStream;

public class ClashOfCode1 {
    public static void main(String[] args) {
        String team2 = "0.25;0.64;.0125;.215;.125;.987;.35;.24";
        String team1 = ".24;.215;.01;.025;.95;.35;.254;.245;.2";

        double a = Arrays.stream(team1.split(";"))
                .flatMapToDouble(str -> DoubleStream.of(Double.parseDouble(str))).sum();
        //System.out.println(a);
        double b = Arrays.stream(team2.split(";"))
                .flatMapToDouble(str -> DoubleStream.of(Double.parseDouble(str))).sum();
        //System.out.println(b);

        System.out.println(a > b ? "team1" : b > a ? "team2" : "draw");

        /*
        String[] split1 = team1.split(";");
        String[] split2 = team2.split(";");

        double t1 = 0;
        for(String s : split1){
            t1 = t1 + Double.parseDouble(s);
        }

        double t2 = 0;
        for(String s : split2){
            t2 = t2 + Double.parseDouble(s);
        }

        if(t1 > t2){
            System.out.println("team1");
        }else if (t2 > t1){
            System.out.println("team2");
        }else{
            System.out.println("draw");
        }
        */

    }
}
