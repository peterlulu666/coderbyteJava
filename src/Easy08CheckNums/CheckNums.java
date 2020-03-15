/*
Coderbyte coding challenge: Check Nums

Using the C++ language, have the function CheckNums(num1,num2) take both
parameters being passed and return the string true if num2 is greater than num1,
otherwise return the string false. If the parameter values are equal to each
other then return the string -1.

Sample test cases:

Input:  3 & 122 = 122
Output: "true"

Input:  67 & 67 = 67
Output: "-1"

Input:  83 & 67 = 67
Output: "false"
*/
package Easy08CheckNums;


public class CheckNums {

    String greaterNumber(int numOne, int numTwo) {
        if (numOne == numTwo) {
            return "-1";

        }

        if (numOne < numTwo) {
            return "true";

        }

        return "false";
    }

    public static void main(String[] args) {
        var checkNums = new CheckNums();
        System.out.println(checkNums.greaterNumber(3, 122));
        

    }

}
