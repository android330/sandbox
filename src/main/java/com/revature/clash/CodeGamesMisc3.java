package com.revature.clash;

import java.util.Hashtable;
import java.util.Scanner;

// MIME Type
public class CodeGamesMisc3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // Number of elements which make up the association table.
        int Q = in.nextInt(); // Number Q of file names to be analyzed.

        Hashtable<String, String> ht = new Hashtable<>();

        for (int i = 0; i < N; i++) {
            String EXT = in.next().toLowerCase(); // file extension
            String MT = in.next(); // MIME type.

            ht.put(EXT, MT);
        }
        in.nextLine();

        System.err.println(ht);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Q; i++) {
            String FNAME = in.nextLine().toLowerCase(); // One file name per line.
            System.err.print(FNAME + ",");
            if(!FNAME.contains(".") || FNAME.charAt(FNAME.length() - 1) == '.'){
                sb.append("UNKNOWN\n");
                continue;
            }
            String[] s1 = FNAME.split("[.]");
            String s = ht.get(s1.length >= 2 ? s1[s1.length - 1] : "UNKNOWN");
            sb.append(s != null ? s : "UNKNOWN").append("\n");

        }
        System.err.println();



        // For each of the Q filenames, display on a line the corresponding MIME type. If there is no corresponding type, then display UNKNOWN.
        System.out.println(sb);


    }
}
