package DSA;
import java.util.*;
public class rectangle {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the length of the rectangle");
        int length = sc.nextInt();
        System.out.println("Enter the breadth of the rectangle");
        int breadth = sc.nextInt();
        int area = calculateArea(length, breadth);
        System.out.println("The area of the rectangle is: " + area);

    }
    public static int calculateArea(int length, int breadth) {
        return length * breadth;
    }
}
