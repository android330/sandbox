package com.revature.clash;

import java.util.*;


// ASCII Art Solution
public class CodeGamesMisc1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();

        List<StringBuilder> letterStringArray = new ArrayList<>();
        for(int i= 0; i < 28; i++)
            letterStringArray.add(new StringBuilder());

        int H = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String T = in.nextLine();
        for (int i = 0; i < H; i++) {
            String ROW = in.nextLine();
            for(int x = 0; x < ROW.length(); x++){
                letterStringArray.get(x/L).append(ROW.charAt(x));
            }
        }


        //List<StringBuilder> returnStrngArray = new ArrayList<>();
        StringBuilder returnString = new StringBuilder();
        for(int i= 0; i < H; i++){
            //returnStrngArray.add(new StringBuilder());

            for(int x = 0; x < T.length(); x++){
                int c = Character.toUpperCase(T.charAt(x)) - 65;
                returnString.append(letterStringArray.get((c >= 0 && c <= 25) ? c : 26).substring(i*L, i*L+L));
            }
            returnString.append("\n");
        }

        // System.err.println(returnStrngArray);

        in.close();

        System.out.println(returnString.toString());
    }
}
