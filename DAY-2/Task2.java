public class Task2 {
    public static void main(String[] args) {
        //factorial();
        //reverseNumber();
        //sumtillSingleDigit();
        //reverseString();
        //strongNumber();
        //perfectnumber();
        //fibonacciNumber();
        //fibonacciRange();
        fibonaccibtwRange();
    }
    static void factorial(){
        int n=5;
        int prod=1;
        for(int i=1;i<=5;i++){
            prod=prod*i;
        }
        System.out.println(prod);
    }
    static void reverseNumber(){
        int n=1234;
        while(n>0){
            int d=n%10;
            System.out.print(d);
            n=n/10;
        }
    }
    static void sumtillSingleDigit(){
        int n=29999;
        while(n>9){
            int sum=0;
            while(n>0){
                int d=n%10;
                sum=sum+d;
                n=n/10;
            }
            System.out.println(sum);
            n=sum;
        }
    }
    static void reverseString(){
        String name="Nithin Gowda";
        for(int i=name.length()-1;i>=0;i--){
            //remove space
            if(name.charAt(i)==' '){
                continue;
            }
            System.out.print(name.charAt(i));
        }
    }
    static void strongNumber(){
        int n=145;
        int sum=0;
        while(n>0){
            int d=n%10;
            int prod=1;
            for(int i=1;i<=d;i++){
                prod=prod*i;
            }
            sum+=prod;
            n=n/10;
        }
        System.out.println(sum);
    }
    static void perfectnumber(){
        int n=6;
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }if(sum==n){
            System.out.println("Its a Perfect Nummber");
        }else{
            System.out.println("Its Not a Perfect Nummber");
        }
    }
    static void fibonacciNumber(){
        int a=0;
        int b=1;
        for(int i=1;i<=5;i++){
            System.out.println(a);
            int sum=a+b;
            a=b;
            b=sum;
        }
    }
    static void fibonacciRange(){
        int n=100;
        int a=0;
        int b=1;
        int c=0;
        while(a<100){
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
    }
    static void fibonaccibtwRange(){
        int l=20;
        int u=100;
        int a=0;
        int b=1;
        int sum=0;
        while(a<=u){
            if(a>=l){
                System.out.println(a);
            }
                sum=a+b;
                a=b;
                b=sum;
        }
    }
}
