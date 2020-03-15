/*
Coderbyte coding challenge: Alphabet Soup

Using the C++ language, have the function AlphabetSoup(str) take the str string
parameter being passed and return the string with the letters in alphabetical
order (ie. hello becomes ehllo). Assume numbers and punctuation symbols will not
be included in the string.

Sample test cases:

Input:  "coderbyte"
Output: "bcdeeorty"

Input:  "hooplah"
Output: "ahhloop"
*/


package Easy10AalphabetSoup;

import java.util.Arrays;

public class AalphabetSoup {
    String alphabeticalOrder(String str) {
        // Declare characterArray
        var characterArray = new char[str.length()];
        // Store letter in str to characterArray
        for (int i = 0; i < str.length(); i++) {
            characterArray[i] = str.charAt(i);

        }
        Arrays.sort(characterArray);
        String reverseStr = "";
        for (int i = 0; i < characterArray.length; i++) {
            reverseStr = reverseStr + characterArray[i];

        }

        return reverseStr;

    }

    public static void main(String[] args) {
        var aalphabetSoup = new AalphabetSoup();
        System.out.println(aalphabetSoup.alphabeticalOrder("bcdeeorty"));

    }

}
