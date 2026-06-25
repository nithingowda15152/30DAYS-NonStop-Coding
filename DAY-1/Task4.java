//conditional statements
import java.util.*;
public class Task4 {
    public static void main(String[] args) {
        //ternaryoperator();
        //oddeven();
        //greatestbetweentwo();
        //leapyear();
        Task4 T=new Task4();
        T.currencycounter();
    }
    public static void ternaryoperator(){
        int n=10;
        int b=20;
        int s=n>b?n:b;
        System.out.println(s);
    }
    public static void oddeven(){
        int n=10;
        if(n%2==0){
            System.out.println("Even");
        }else{
            System.out.println("odd");
        }
    }
    static void greatestbetweentwo(){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b){
            System.out.println("a is greatest");
        }else if (b>a) {
            System.out.println("b is greatest");
        }else{
            System.out.println("Both are equal");
        }
    }
    static void leapyear(){
        int n=2025;
        if((n%400==0)||((n%100!=0)&&(n%4==0))){
            System.out.println("leapyear");
        }else{
            System.out.println("not a leap year");
        }
    }
    void currencycounter(){
        int n=4800;
        if(n%2000>=0){
            System.out.println("2000 X "+(n/2000));
            n=n%2000;
        }
        if(n%500>=0){
            System.out.println("500 X "+(n/500));
            n=n%500;
        }
        if(n%200>=0){
            System.out.println("200 X "+(n/200));
            n=n%200;
        }
        if(n%100>=0){
            System.out.println("100 X "+(n/100));
            n=n%100;
        }
    }
    static void NoOfDays(){
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        int m=sc.nextInt();
        switch(m){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:System.out.println("31 days");
            break;
            case 4:
            case 6:
            case 9:
            case 11:System.out.println("30 days");break;
            case 2:
                if((m%400==0)||((m%100!=0)&&(m%4==0))){
            System.out.println("leapyear");
        }else{
            System.out.println("not a leap year");
        }break;
        default:System.out.println("Invalid Input");
        }
    }
}
