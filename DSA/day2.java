package DSA;
import java.util.*;
public class day2 {
    public static void main(String[] args){
       /*  int age=10;
        System.out.println(age);

        int var1 = age++;
        int var2 = ++age;

        System.out.println(var1);
        System.out.println(var2);*/

        /*int num = 11;
        String even = num % 2 == 0 ? "even" : "odd";
        System.out.println("The number is "+ even);*/

        /*int btn = 1;

        switch (btn){
            case 1:{
                System.out.println("Clicked the button 1");
                break;
            }
            case 2:{
                System.out.println("Clicked on button 2");
                break;
            }
            case 3:{
                System.out.println("Clicked on btn 3");
                break;
            }
            default : {
                System.out.println("Please click on the right button");
            }*

        }*/
        /*
         * Q1)Take three variable 1,2,3 and default case for other number 
         * 
         */
        /*Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        switch (num){
            case 1:{
                    System.out.println("The number is 1");
            case 2 :{
                    System.out.println("The number is 2");
            case 3 :{
                    System.out.println("The number is 3");
                default : {
                    system.out.println("Give the correct number");
                }
            }
        }*/
        /*
         * Three types of loops in java for, while, do while
         */

        //for loop
        /*Steps:
         * 1)Intialize loop
         * 2)Termination
         * 3)Increment or decrement
         * 
         */
        /*for (int i=1;i< 11;i++){
            System.out.print(i + " ");
        }*/

        /*
         * While loop
         * steps:
         * 1) intitialize variable
         * 2)Termination in while statement
         */
        /*int i=1;
        while(i< 11){
            System.out.print(i + " ");
            i++;
        }*/
        /*
         * Do while
         * steps:
         * 1) intitialize variable
         * 2) do and its condition
         * 3)while loop and its condition
         */
        /*int i=1;
        do{ 
            System.out.print(i + " ");
            i++;
        }while(i<11);*/

        /*for(int i=1; i<10; i++){
            
            System.out.print(i + " ");
        }*/
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            System.out.print(i + " ");

        }*/
        //Square
        /*for(int j=0;j<4;j++){
            for (int i=0;i<5;i++){
            System.out.print("*");
            }
            System.out.println();
        }*/
        for(int row = 0; row<4; row++){
            for (int column =0;column<5; column++){
                if(row == 0 || row ==3){
                    System.out.print("*");
                }else{
                    if(column ==0 || column ==4){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                
            }
            System.out.println();
        }
}
}