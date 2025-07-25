
import java.util.*;

public class Prime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        if(num%num==0){
            System.out.println("Number is Prime.");
        }
        else{
            System.out.println("Number is not Prime.");
        }
    }
}