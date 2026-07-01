public class Casting {
    public static void main(String[] args) {
        widening();
        narrowing();
        m1(1);
        m1('A');
        m1('a');
        System.out.println(m2());
        pow(10, 2);
        parsing();
        int sum=0;

        //using built-in ParesInt method
        for(String n:args){
            sum+=Integer.parseInt(n);
        }
        System.out.print(sum);
    }
    static void widening(){
        int a=10;
        double d=a;
        System.out.println(d);
    }
    static void narrowing(){
        double b=100.00;
        int a=(int)b;
        System.out.println(a);
    }
    static void m1(double d){
        System.out.println(d);
    }
    static double m2(){
        int a=4*30;
        return a;
    }
    static double pow(double a,double b){
        int n=(int)Math.pow(a, b);
        return n;
    }
    static void parsing(){
        String s1="3568";
        int n=0;
        for(int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
            n=(n*10)+(c-'0');
        }
        System.out.println(n);
    }
}
