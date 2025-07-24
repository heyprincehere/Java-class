package DSA;

public class Day6 {
    public static void main(String[] args) {
        int arr[]={1,2,4,7,11};
        binarySearch(arr, 2);  
        System.out.print("The elemnt is at:"+ " ");
    }

    public static int binarySearch(int arr[], int elements) {
        int left =0;
        int right = arr.length-1;

        while(left<= right){
            int mid =(left+ right)/2;

            if(arr[mid] == elements){
                return mid;
            }else if(arr[mid]> elements){
                right =mid-1;
            }else{
                left =mid +1;
            }
            }
            return -1;
        }
}

