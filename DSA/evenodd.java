package DSA;

import java.util.*;
public class Evenodd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        
        if (number%2==0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        
    }
}
