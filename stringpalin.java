import java.util.*;
public class stringpalin {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String s = sc.nextLine();
        
        int left=0;
        int right=s.length()-1;
        boolean ispalindrome= true;
        
        while(left< right){
            if(s.charAt(left) != s.charAt(right)){
                ispalindrome =false;
                break;
            }
            left++;
            right--;
        }
        if(ispalindrome){
            System.out.print("It is a palindrome");
        }
        else{
            System.out.print("It is not a palindrome");
        }


    }
}
