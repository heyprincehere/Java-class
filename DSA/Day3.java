package DSA;
import java.util.*;
public class Day3{
    public static void main(String[] args){
        /*boolean isPrime = isPrime(5);
        System.out.println(isPrime);*/
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.println(reversenumber(num));


    }
    /*public static boolean isPrime (int n) {
        if(n ==1 || n<1){
            return false;
        }
        for (int i =2; i<= n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }*/
    public static int reversenumber(int num){
        int ans =0;
        while(num > 0){
            int remainder = num % 10;
            ans =ans * 10 + remainder;
            num = num/10;
        }
        return ans;
    }
}