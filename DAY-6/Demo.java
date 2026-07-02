//HOW OBJECT WORKS
class B{
    int i;
    static void m1(){
        //System.out.println(i);(CTE-Non static member cannot be reffered from a static method directly)
        B b=new B();
        //System.out.println(b.i);(Possible using object creation)
    }
}

// class OOPbasic {

//     public static void main(String[] args) {

//         int x = 10;

//         add(x);

//         System.out.println("Main Ends");
//     }

//     static void add(int a) {

//         int b = 20;

//         System.out.println(a + b);
//     }
// }
/*public class Demo {

    public static void main(String[] args) {

        System.out.println("A");

        m1();

        System.out.println("D");
    }

    static void m1() {

        System.out.println("B");

        m2();

        System.out.println("C");
    }

    static void m2() {

        System.out.println("X");
    }
}
    */

//Pass by value
/*class Student {

    int id;
}

public class Demo {

    static void change(Student s) {

        s.id = 100;
    }

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.id = 10;

        change(s1);

        System.out.println(s1.id);
    }
} 
    */

class Student {

    int id;
}

public class Demo {

    static void m(Student s) {

        s.id = 50;

        s = new Student();

        s.id = 100;
    }

    public static void main(String[] args) {

        Student s = new Student();

        s.id = 10;

        m(s);

        System.out.println(s.id);
    }
}
