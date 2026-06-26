//Basic loops
public class Task1{
    public static void main(String[] args) {
        //print1to10();
        //printEven();
        //sumof10();
        //breakStatement();
        //continueStatement();
        //whileloop();
        dowhileLoop();
    }
    static void print1to10(){
        int n=10;
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
    }
    static void printEven(){
        int n=10;
        for(int i=2;i<=n;i+=2){
            System.out.println(i);
        }
    }
    static void sumof10(){
        int n=10;
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
    static void breakStatement(){
        for(int i=1;i<=10;i++){
            if(i%3==0){break;}
            System.out.println(i);
        }
    }
    static void continueStatement(){
        for(int i=1;i<=10;i++){
            if(i%3==0){continue;}
            System.out.println(i);
        }
    }
    static void whileloop(){
        int n=10;
        int i=1;
        while(i<=n){
            System.out.println(i);
            i++;
        }
    }
    static void dowhileLoop(){
        int i=1;
        do { 
            System.out.println(i);
            i+=2;
        } while (i<=10);
    }
}
