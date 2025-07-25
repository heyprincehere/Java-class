 import java.util.*;
 public class Displacement{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the directions:");
        String d = sc.nextLine().toUpperCase();
        int x=0;
        int y=0;
        int i=0;
        while(i<d.length()){
            if(d.charAt(i)=='N'){
               y++;
            }
            else if(d.charAt(i)=='S'){
               y--;
            }
            else if(d.charAt(i)=='E'){
               x++;
            }
            else if(d.charAt(i)=='W'){
               x--;
            }
            i++;
        }
        double displacement = Math.sqrt(x * x + y * y);
        System.out.println("Displacement: " + displacement);
    }
 }