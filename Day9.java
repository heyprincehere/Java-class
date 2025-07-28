public class Day9 {
    public static void main(String[] args) {
        Child c1 = new Child();
        sum(2,3);
        sum(5,6);
       // printAllNumbers(5);
        System.out.print(Factorial(3));
        System.out.println(Sumofn(5));
        System.out.println(Fibonacci(5));
        int[] arr = {1, 10, 3, 4, 5};
        System.out.println(isSorted(arr, 0));
    }
    //Print all the number from 1 to 10
    /*public static void printAllNumbers(int n){
        if(n==0){
            return;
        }

        System.out.print(n+" ");
        printAllNumbers(n-1);
    }*/
    // Factorial
    public static int Factorial(int n){
        if(n==1){
            return 1;
        }
        return n*Factorial(n-1);
    }
 // Sum of natural numbers
    public static int Sumofn(int n){
        if(n==1){
            return 1;
        }

        return n+Sumofn(n-1);
    }
// Fibonacci series
    public static int Fibonacci(int n){
        if(n==0||n==1){
            return n;
        }
        return Fibonacci(n-1)+Fibonacci(n-2);
    }
// checkif array is sorted or not
    public static boolean isSorted(int arr[],int i){
        if(i == arr.length-1){
            return true;
        }
        return((arr[i]<arr[i+1]&& isSorted(arr, i+1)));
        

    }


    static void sum(int a, int b){
        System.out.println(a+b);
    }
    static class B{
        int arr[]= {1,2,3};
    }
    static class A{
        int var1;
        
        int arr1[] = new int[3];

        public A(int var1){
            this.var1 = var1;
        }
        public A(){
            
        }
        //copy constructor
        public A(B obj){
            for(int i=0;i<obj.arr.length;i++){
                arr1[i]=obj.arr[i];

            }

        }


    }

    interface Factory {
        int age=10;
        public void log(int a);
        
    }
    static class Newclass implements Factory{
        private String name;
        private int age;

        public void log(int a){
            System.out.println("hi");
        
        }
    }
        static class Parent{
            public Parent(){
                System.out.println("Parent costructor...");
            }
        }

        static class Child extends Parent{
            public Child(){
                super();
                System.out.println("Child constructor...");
            }
        }

            
    

}









