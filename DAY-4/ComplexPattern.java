public class ComplexPattern {
    public static void main(String[] args) {
        // Pattern1();
        // Pattern2();
        // Pattern3();
        // Pattern4();
        Pattern5();

    }
    static void Pattern1(){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||j==1||i==n||j==n){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    static void Pattern2(){
        int n=5;
        for (int i = 1; i <= n; i++) {
            for(int j=1;j<=n;j++){
                if(j==i||j==n+1-i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void Pattern3(){
        int n=5;
        int space=n-1;
        int star=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            System.out.println();
            star+=2;
            space--;
        }
    }
    static void Pattern4(){
        int n=5;
        int space=n-1;
        int star=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=star;j++){
                if(j==1||j==star||i==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            star+=2;
            space--;
        }
    }
    static void Pattern5(){
        int n=5;
        int space=n-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=i-1;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
            space--;
        }
    }
}
