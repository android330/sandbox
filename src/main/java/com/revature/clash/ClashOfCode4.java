package com.revature.clash;

import java.util.*;

public class ClashOfCode4 {
    public float dis;
    public String item;

    public static void main(String[] args) {
        String[] items = {"Thing", "Book", "Tree"};
        float[] distances = {2, 7, 4};

        List<ClashOfCode4> things = new ArrayList<>();
        for(int i = 0; i < items.length; i ++){
            ClashOfCode4 c = new ClashOfCode4();
            c.dis = distances[i];
            c.item = items[i];
            things.add(c);
        }

        things.sort(Comparator.comparing(a->a.dis));
        things.forEach(a->System.out.print(a.item + " "));



        /*
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        List<String> things = new ArrayList<>();
        List<Float> distances = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String item = in.next();
            float distance = in.nextFloat();
            things.add(item);
            distances.add(distance);

        }

        for(int i = 0; i < distances.size(); i++){
            for(int x = i; x < distances.size(); x++){
                if(distances.get(i) < distances.get(x)){
                    float temp = distances.get(i);
                    distances.set(i, distances.get(x));
                    distances.set(x, temp);

                    String temp1 = things.get(i);
                    things.set(i, things.get(x));
                    things.set(x, temp1);
                }
            }
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
        for(String s : things){
            System.out.print(s);
            if(things.indexOf(s) != things.size() - 1){
                System.out.print(" ");
            }
        }
        System.out.println();
        */
    }
}
