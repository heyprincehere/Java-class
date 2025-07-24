import java.util.*;
public class Day7{
    
    public static void main(String[] args) {
        int arr[][]={
            {10,20,30,40},
            {15,25,35,45},
            {32,33,39,50}
        };
        sorted(arr, 39);
        /*int arr[][]={
            {2,3,4,5},
            {6,7,8,9},
            {10,11,12,13}
        };*/
        //spiral(arr);
        //findkey(arr,6);
        
    }
    /*public static void findkey(int arr[][], int key){
        boolean isfound =false;
        for(int i=0;i<arr.length;i++){
            for(int j = 0; j<arr[0].length; j++){
                    if(arr[i][j]==key){
                        System.out.print("The element is at: "+"row:"+i+" Column:"+j);
                        isfound = true;

                    }
            }
        }
        if(!isfound){
            System.out.print("The number is not in the list");
        }
    }*/
    /*public static void spiral(int arr[][]){
        int sr= 0; int sc=0;
        int er=arr.length-1; int ec= arr.length-1;
        while(sr<= er && sc <= ec){
            for(int col =sc;col<=ec;col++){
                System.out.print(arr[sr][col]+" ");
            }
            for(int row=sr+1;row<=er;row++){
                System.out.print(arr[row][ec]+" ");
            }
            for(int col = ec-1;col>=0;col--){
                System.out.print(arr[er][col]+" ");
            }
            for(int row= er-1; row>sr;row--){
                System.out.print(arr[row][sc]+" ");
            }
            sr++;sc++;
            er--;ec--;
        }

    }*/
    public static void sorted(int arr[][],int key){
        int row=0;int col=0;
        boolean isfound =false;
        while(row<arr.length && col>=arr.length){
            if(arr[row][col]==key){
                System.out.print("The key is at "+"row:"+row+" col:"+col);
                isfound = true;
                return;
            }
            else if(arr[row][col]>key){
                col--;
            }
            else {
                row ++;
            }
            if(!isfound){
                System.out.print("The elements is not present in the matrix");
            }

    }
}
}// string is palindrom and displacement