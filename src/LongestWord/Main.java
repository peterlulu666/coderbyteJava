package LongestWord;

import java.util.*;
import java.io.*;

class Main {

    public static String LongestWord(String sen) {
        String[] wordArray = cleanWords(sen);
        // Store words length to integer array
        int[] wordLength = new int[wordArray.length];
        for (int i = 0; i < wordArray.length; i++) {
            wordLength[i] = wordArray[i].length();

        }
        // Sort the integer array
        Arrays.sort(wordLength);
        // The length of the longest word
        int longestWord = wordLength[wordLength.length - 1];
        // The first longest word in word array
        String longestWordStr = "";
        for (int i = 0; i < wordArray.length; i++) {
            if (wordArray[i].length() == longestWord) {
                longestWordStr = longestWordStr + wordArray[i];
                break;

            }

        }
//        // All the longest words in word array
//        String longestWordStr = "";
//        for (int i = 0; i < wordArray.length; i++) {
//            if (wordArray[i].length() == longestWord){
//                longestWordStr = longestWordStr + wordArray[i] + " ";
////                break;
//
//            }
//
//        }
        return longestWordStr;

    }

    public static String[] cleanWords(String sen) {
        // String to array of character
        sen = sen.toLowerCase();
        char[] letterArray = new char[sen.length()];
        for (int i = 0; i < sen.length(); i++) {
            if (Character.isAlphabetic(sen.charAt(i))) {
                letterArray[i] = sen.charAt(i);

            } else {
                letterArray[i] = ' ';

            }

        }
        // Join
        String wordString = "";
        String separator = "";
        for (int i = 0; i < letterArray.length; i++) {
            wordString = wordString + (letterArray[i] + separator);

        }
        String[] wordArray = wordString.trim().split(" ");
        return wordArray;

    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LongestWord(s.nextLine()));


    }

}