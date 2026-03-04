

import java.util.*;

class program1 {
    public static int func(int a) {
        int result = 0;
        while (a > 0) {
            result = result + (a % 10);
            a /= 10;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int input = s.nextInt();
        int result = func(input);
        if (result < 10) {
            System.out.println("Result = " + result);
        }
        else {
            result = func(result);
            System.out.println("Result = " + result);
        }
    }
}