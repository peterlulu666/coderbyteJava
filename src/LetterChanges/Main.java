package LetterChanges;

import java.util.*;
import java.io.*;

class Main {

    public static String LetterChanges(String str) {
        // String to array of character
        str = str.toLowerCase();
        char[] letterArray = new char[str.length()];
        for (int i = 0; i < letterArray.length; i++) {
            if (str.charAt(i) == 'z') {
                letterArray[i] = 'a';

            } else if (str.charAt(i) == ' ') {
                letterArray[i] = ' ';

            } else if (Character.isAlphabetic(str.charAt(i)) && str.charAt(i) != 'z') {
                letterArray[i] = (char) (str.charAt(i) + 1);

            } else {
                letterArray[i] = str.charAt(i);

            }

        }
        // Capitalize vowel
        String capitalizeVowel = "";
        for (int i = 0; i < letterArray.length; i++) {
            if (letterArray[i] == 'a' ||
                    letterArray[i] == 'e' ||
                    letterArray[i] == 'i' ||
                    letterArray[i] == 'o' ||
                    letterArray[i] == 'u') {
                capitalizeVowel = capitalizeVowel + (letterArray[i] + "").toUpperCase();

            } else {
                capitalizeVowel = capitalizeVowel + letterArray[i];

            }

        }
        return capitalizeVowel;

    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LetterChanges(s.nextLine()));


    }

}
