public class Recursion {
    public static void main(String[] args) {
        // display(1);
        // display(5,10);
        // System.out.println(sum(5));
        // System.out.println(factorial(5));
        // System.out.println(sumofdigits(83416));
        System.out.println(fib(4));
    }
    static void display(int n){
        if(n>10)return;
        System.out.println(n);
        display(n+1);
    }
    static void display(int start,int end){
        if(start>end)return;
        System.out.println(start);
        display(start+1,end);
    }
    static int sum(int n){
        if(n==1)return 1;
        return n+sum(n-1);
    }
    static int factorial(int n){
        if(n==0||n==1)return 1;
        return n*factorial(n-1);
    }
    static int sumofdigits(int n){
        if(n<=9)return n;
        return sumofdigits(n/10)+sumofdigits(n%10);
    }
    static void reverse(int n){
        if(n<=9){
            System.out.print(n);
            return;
        }
        System.out.print(n%10);
        reverse(n/10);
    }
    static int fib(int n){
        if(n==0||n==1)return n;
        return fib(n-1)+fib(n-2);
    }
}
