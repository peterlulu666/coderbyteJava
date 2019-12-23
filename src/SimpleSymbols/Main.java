/*
Coderbyte coding challenge: Simple Symbols

Using the C++ language, have the function SimpleSymbols(str) take the str
parameter being passed and determine if it is an acceptable sequence by either
returning the string true or false. The str parameter will be composed of + and
= symbols with several letters between them (ie. ++d+===+c++==a) and for the
string to be true each letter must be surrounded by a + symbol. So the string to
the left would be false. The string will not be empty and will have at least one
letter.

Sample test cases:

Input:  "+d+=3=+s+"
Output: "true"

Input:  "f++d+"
Output: "false"
*/

package SimpleSymbols;

public class Main {
    public static void main(String[] args) {
        String words = "++d+===+c++==a";
        boolean isAcceptableSequence = false;
        for (int i = 0; i < words.length(); i++) {
            if (words.length() <= 2) {
                isAcceptableSequence = false;

            } else if (Character.isAlphabetic(words.charAt(0)) ||
                    Character.isAlphabetic(words.charAt(words.length() - 1))) {
                isAcceptableSequence = false;

            } else if (Character.isAlphabetic(words.charAt(i)) &&
                    words.charAt(i - 1) == '+' &&
                    words.charAt(i + 1) == '+') {
                isAcceptableSequence = true;
                break;


            } else {
                isAcceptableSequence = false;

            }

        }
        System.out.println(isAcceptableSequence);
        System.out.println(contains(words, '='));
        System.out.println(isAcceptableSequence && contains(words, '='));


    }

    public static boolean contains(String words, char letter) {
        for (int i = 0; i < words.length(); i++) {
            if (words.charAt(i) == letter) {
                return true;

            }

        }
        return false;

    }
}