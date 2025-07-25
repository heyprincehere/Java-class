package DSA;

import java.util.*;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int input1= sc.nextInt();
        System.out.println("Enter second number:");
        int input2 = sc.nextInt();
        add(input1, input2);
        System.out.println("The sum is: " + (input1 + input2));

    }
    public static int add(int x, int y) {
        return x + y;
    }
}
