package com.revature.clash;
/*
Given a number num return the shortest amount of steps it would take from 1 to land exactly on that number.

Description:

A step is defined as either:
Adding 1 to the number: num += 1 or
Doubling the number: num *= 2

You will always start from the number 1 and you will have to return the shortest count of steps it would take to land exactly on that number.

Examples:

num == 3 would return 2 steps:
1 -- +1 --> 2 : 1 step
2 -- +1 --> 3 : 2 steps

num == 12 would return 4 steps:
1 -- +1 --> 2 : 1 step
2 -- +1 --> 3 : 2 steps
3 -- x2 --> 6 : 3 steps
6 -- x2 --> 12 : 4 steps

num == 16 would return 4 steps:
1 -- +1 --> 2 : 1 step
2 -- x2 --> 4 : 2 steps
4 -- x2 --> 8 : 3 steps
8 -- x2 --> 16 : 4 steps
 */


public class ClashOfCode3 {
    public static void main(String[] args) {
        int num = 16;

        /*
        int num2 = 1;
        int steps = 0;
        while (num2 != num) {
            //System.out.println(num2);
            if (num2 * 2 > num) {
                num2 += 1;
                steps++;
            } else {
                num2 *= 2;
                steps++;
            }


            System.out.println(steps);
        }

         */

        int steps = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num--;
            }
            steps++;
        }
        System.out.println(steps-1);
    }
}
