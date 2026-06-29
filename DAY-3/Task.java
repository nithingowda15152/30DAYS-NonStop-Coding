//Some Complex loop problems and simple number patterns
public class Task {
    public static void main(String[] args) {
        //primenumber();
        //primenumberBtwRange();
        //highestPrimeNumber();
        //firstNprime();
        //Automorphic();
        //amstrongNumber();
        //reverse();
        //palindrome();
        //LCM();
        //HCF();
        //HCF2();
        //decimalTObinary();
        //binaryTOdecimal();
        //pattern1();
        //pattern2();
        //pattern3();
        //pattern4();
        //pattern5();
        //pattern6();
        //pattern7();
        pattern8();
    }
    static void primenumber(){
        int n=2;
        boolean isPrime=true;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime && n>=2){
            System.out.println("Its a prime Number");
        }else{
            System.out.println("Its not a prime number");
        }
    }
    static void primenumberBtwRange(){
        int a=20;
        int b=100;
        for(int n=a;n<=b;n++){
            boolean flag=true;
            for(int i=2;i<=n/2;i++){
                if(n%i==0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.println(n);
            }
        }
    }
    static void highestPrimeNumber(){
        for(int a=100;a>=20;a--){
            boolean flag=true;
            for(int i=2;i<=a/2;i++){
                if(a%i==0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.println(a);
                break;
            }
        }
    }
    static void firstNprime(){
        int n=5;
        int count=0;
        int i=2;
        while(true){
            boolean flag=true;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    flag=false;
                }
            }
            if(flag){
                System.out.println(i);
                count++;
                if(count==n){
                    break;
                }
            }
            i++;
        }
    }
    static void Automorphic(){
        int n=10;
        int sq=n*n;
        boolean flag=true;
        while(n>0){
            if((n%10)!=(sq%10)){
                flag=false;
                break;
            }
            n=n/10;
            sq=sq/10;
        }
        if(flag){
            System.out.println("Automorphic");
        }else{
            System.out.println("Not automorphic");
        }
    }
    static void amstrongNumber(){
        int n=153;
        int temp=n;
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        n=temp;
        int sum=0;
        while(n>0){
            int d=n%10;
            int prod=1;
            for(int i=1;i<=count;i++){
                prod=prod*d;
            }
            sum=sum+prod;
            n=n/10;
        }
        if(sum==temp){
            System.out.println("Amstrong Number");
        }else{
            System.out.println("Not a Amstrong Number");
        }
    }
    static void reverse(){
        int n=123;
        int rev=0;
        while(n>0){
            int d=n%10;
            rev=(rev*10)+d;
            n=n/10;
        }
        System.out.println(rev);
    }
    static void palindrome(){
        int n=121;
        int rev=0;
        int temp=n;
        while(n>0){
            int d=n%10;
            rev=(rev*10)+d;
            n=n/10;
        }
        if(temp==rev){
            System.out.println("Paindrome NUmber");
        }else{
            System.out.println("Not a Plaindrome");
        }
    }
    static void LCM(){
        int a=4;
        int b=6;
        int i=a>b?a:b;
        int n=i;
        while(true){
            if((i%a==0)&&(i%b==0)){
                break;
            }
            i=i+n;
        }
        System.out.println(i);
    }
    static void HCF(){
        int a=9;
        int b=27;
        int i=a<b?a:b;
        while(true){
            if((a%i==0)&&(b%i==0)){
                break;
            }
            i--;
        }
        System.out.println(i);
    }
    static void HCF2(){
        int a=12;
        int b=18;
        int hcf=1;
        for(int i=1;((i<=a)&&(i<=b));i++){
            if((a%i==0)&&(b%i==0)){
                hcf=i;
                //printing hcf's until getting largest
                System.out.println(i);
            }
        }
        //last highest hcf
        System.out.println("s0 the hcf is "+hcf);
    }
    static void decimalTObinary(){
        int n=75;
        int i=1;
        int bin=0;
        while(n>0){
            int bit=n%2;
            bin=(bit*i)+bin;
            n=n/2;
            i=i*10;
        }
        System.out.println(bin);
    }
    static void binaryTOdecimal(){
        int bin=1011;
        int dec=0;
        int i=0;
        while(bin>0){
            int bit=bin%10;
            dec=dec+bit*(int)Math.pow(2, i);
            bin=bin/10;
            i++;
        }
        System.out.println(dec);
    }
    static void pattern1(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.println(i+" "+j);
            }
        }
    }
    static void pattern2(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.println(i+" "+j);
                if(j%3==0)break;
            }
        }
    }
    static void pattern3(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.println(i+" "+j);
            }
            if(i%3==0)break;
        }
    }
    static void pattern4(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.println(i+" "+j);
                if(i%3==0)break;
            }
        }
    }
    static void pattern5(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.println(i+" "+j);
                if(i%3==0)break;
            }
           if(i%3==0)break; 
        }
    }
    static void pattern6(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.println(i+" "+j);
                if(i%2==0)break;
            }
            if(i%3==0)break;
        }
    }
    static void pattern7(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.println(i+" "+j);

            }
        }
    }
    static void pattern8(){
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.println(i+" "+j);
            }
        }
    }
}
