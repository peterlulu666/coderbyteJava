/*
Simple Adding
Have the function SimpleAdding(num) add up all the numbers from 1 to num.
For example: if the input is 4 then your program should return 10
because 1 + 2 + 3 + 4 = 10. For the test cases, the parameter
num will be any number from 1 to 1000.
Examples
Input: 12
Output: 78
Input: 140
Output: 9870
*/
package SimpleAdding;

import java.util.*;
import java.io.*;

class Main {

    public static int SimpleAdding(int num) {
        // Base case
        if (num == 0) {
            return 0;
        } else {
            return num + SimpleAdding(num - 1);

        }
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.print(SimpleAdding(num));

    }

}