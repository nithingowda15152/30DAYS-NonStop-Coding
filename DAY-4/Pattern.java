//star & some complex patterns
public class Pattern {
    public static void main(String[] args) {
        //pattern1();
        //pattern2();
        //pattern3();
        //pattern4();
        //pattern5();
        //pattern6();
        // pattern7();
        // pattern8();
        //pattern9();
        // pattern10();
        // patt10in2loop();
        // pattern11();
        //pattern12();
        // pattern13();
        // pattern14();
        // pattern15();
        // pattern16();
        pattern17();
    }
    static void pattern1(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern2(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern3(){
        char c='A';
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(c);
            }
            System.out.println();
            c++;
        }
    }
    static void pattern4(){
        char c='A';
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }
    static void pattern5(){
        for(int i=1;i<=5;i++){
            char c='A';
            for(int j=1;j<=i;j++){
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }
    static void pattern6(){
        for(int i=1;i<=5;i++){
            if(i%2!=0){
                for(int j=5;j>=1;j--){
                    System.out.print(j);
                }
            }
            if(i%2==0){
                for(int j=1;j<=5;j++){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
    static void pattern7(){
        for(int i=5;i>=1;i--){
            for(int j=5;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern8(){
        for(int i=1;i<=5;i++){
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern9(){
        for(int i=5;i>=1;i--){
            for(int j=i;j<=5;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern10(){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void patt10in2loop(){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<=n-i){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    static void pattern11(){
        int n=5;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern12(){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern13(){
        int n=5;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern14(){
        int n=5;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int j=n;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern15(){
        int n=5;
        for(int i=5;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern16(){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern17(){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
