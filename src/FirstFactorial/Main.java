package FirstFactorial;

import java.util.*;
import java.io.*;

class Main {

    public static int FirstFactorial(int num) {
        if (num == 1) {
            return num;

        }
        return num * FirstFactorial(num - 1);

    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.print(FirstFactorial(num));


    }

}