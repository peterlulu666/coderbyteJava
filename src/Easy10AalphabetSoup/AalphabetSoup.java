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
        // Copy letter in str to characterArray
        for (int i = 0; i < str.length(); i++) {
            characterArray[i] = str.charAt(i);

        }
        // Sort array
        for (int i = 0; i < characterArray.length; i++) {
            for (int leftIndex = 0; leftIndex < characterArray.length - 1; leftIndex++) {
                if (characterArray[leftIndex] > characterArray[leftIndex + 1]) {
                    char temp = characterArray[leftIndex];
                    characterArray[leftIndex] = characterArray[leftIndex + 1];
                    characterArray[leftIndex + 1] = temp;

                }
            }
        }
        // Declare alphabeticalStr
        String alphabeticalStr = "";
        // Copy letter in characterArray to alphabeticalStr
        for (int i = 0; i < characterArray.length; i++) {
            alphabeticalStr = alphabeticalStr + characterArray[i];

        }

        // Return alphabeticalStr
        return alphabeticalStr;

    }

    String alphabeticalLetter(String str) {
        // Copy letter to characterArray
        char[] characterArray = str.toCharArray();
        // Sort characterArray
        Arrays.sort(characterArray);
        // Return letter in alphabetical order
        return new String(characterArray);

    }

    String alphabeticalStr(String str) {
        // Sort string
        String alphabeticalCharacter = "" + str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            for (int j = 0; j < alphabeticalCharacter.length(); j++) {
                if (str.charAt(i) < alphabeticalCharacter.charAt(j)) {
                    // Add the letter to the left
                    alphabeticalCharacter = str.charAt(i) + alphabeticalCharacter;
                    break;

                } else if (alphabeticalCharacter.length() - 1 == j) {
                    alphabeticalCharacter = alphabeticalCharacter + str.charAt(i);
                    break;

                } else if (str.charAt(i) >= alphabeticalCharacter.charAt(j) &&
                        str.charAt(i) <= alphabeticalCharacter.charAt(j + 1)) {
                    alphabeticalCharacter =
                            alphabeticalCharacter.substring(0, j + 1) +
                                    str.charAt(i) +
                                    alphabeticalCharacter.substring(j + 1);
                    break;

                }
            }
        }

        return alphabeticalCharacter;

    }

    public static void main(String[] args) {
        var aalphabetSoup = new AalphabetSoup();
        System.out.println(aalphabetSoup.alphabeticalOrder("coderbyte"));
        System.out.println(aalphabetSoup.alphabeticalLetter("coderbyte"));
        System.out.println(aalphabetSoup.alphabeticalStr("coderbyte"));

    }
}
