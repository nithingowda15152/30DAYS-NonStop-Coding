//use of diff type of variables
public class Task3 {
    String title;
    String answer;
    int a=10;
    static int p=30;
    int n=10;
    static String b="nithin";
    public static void main(String[] args) {
        boolean flag=true;
        Task3 t=new Task3();
        t.a=20;
        System.out.println(t.a);
        System.out.println(b);
        System.out.println(flag);
        t.title="how to master java";
        t.answer="daily practice it";
        System.out.println(t.title);
        Task3 g=new Task3();
        Task3 b=new Task3();
        g.n=20;
        b.n=30;
        System.out.println(g.n);
        System.out.println(b.n);
        g.p=100;
        b.p=120;
        System.out.println(g.p);
        System.out.println(b.p);
        int z=0;
        int x=(z++)+2;
        System.out.println(z);
        System.out.println(x);
    }
}
