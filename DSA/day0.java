package DSA;

public class day0 {
    public static void main(String[] args) {
        int abc =13;
        float f1 = (float) 10.2;
        char name ='a';
        String name1 = "Prince";
        boolean isMonday = false;
        /*
         * genreal format to create a vaariable
         * 
         * datatype variableName = value;
         */
        /*
         * normes of naming a variable
         * 1. variable name should not start with a number
         * 2. variable name should not contain special characters except underscore(_)
         * 3. variable name should not be a reserved keyword
         * 4. variable name should be meaningful
         * 5. variable name should not contain spaces
         */
        int sum3= addition(10, 20);   
        System.out.println("Sum of 10 and 20 is: " + sum3);


    }
 
    public static int addition(int num1, int num2) {
        return num1 + num2;
    }
}
