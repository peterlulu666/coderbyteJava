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