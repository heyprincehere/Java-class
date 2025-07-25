public class Spiral {
    public static void main(String[] args) {
        int arr[][]={
            {2,3,4,5},
            {6,7,8,9},
            {10,11,12,13}
        };
        spiral(arr);
    }
    public static void spiral(int arr[][]){
        int sr= 0; int sc=0;
        int er=arr.length-1; int ec= arr[0].length-1;
        while(sr<=er && sc <= ec){
            for(int col=sc;col<=ec;col++){
                System.out.print(arr[sr][col]+" ");
            }
            for(int row=sr+1;row<=er;row++){
                System.out.print(arr[row][ec]+" ");
            }
            for(int col = ec-1;col>=sc;col--){
                System.out.print(arr[er][col]+" ");
            }
            for(int row= er-1; row>sr;row--){
                System.out.print(arr[row][sc]+" ");
            }
            sr++;sc++;
            er--;ec--;
        }
    }
}
