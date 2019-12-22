/*
Coderbyte coding challenge: Letter Capitalize

Using the C++ language, have the function LetterCapitalize(str) take the str
parameter being passed and capitalize the first letter of each word. Words will
be separated by only one space.

Sample test cases:

Input:  "hello world"
Output: "Hello World"

Input:  "i ran there"
Output: "I Ran There"
*/
package LetterCapitalize;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String words = "aa bb c";
        var wordArr = words.split(" ");
        String wordStr = "";
        for (int i = 0; i < wordArr.length; i++) {
            wordStr = wordStr + wordArr[i].substring(0, 1).toUpperCase() + wordArr[i].substring(1, wordArr[i].length()) + " ";

        }
        System.out.println(Arrays.toString(wordArr));
        System.out.println(wordStr);

        
    }

}
