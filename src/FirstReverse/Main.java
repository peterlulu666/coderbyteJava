package FirstReverse;

import java.util.*;
import java.io.*;

class Main {

    public static String FirstReverse(String str) {
        // code goes here
        String reversed = "";
        for (int i = 1; i <= str.length(); i++) {
            reversed = reversed + str.charAt(str.length() - i);

        }
        // for (int i = 0; i < str.length(); i++) {
        //     reversed = reversed + str.substring(str.length() - 1 - i, str.length() - i);

        // }
        str = reversed;
        return str;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(FirstReverse(s.nextLine()));
    }

}