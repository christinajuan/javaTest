package tw.org.iii;

public class Lab35 {
    public static void main(String[] args){
//        Brad351 obj1 = new Brad351();
//        Brad351 obj2 = new Brad351();
//        obj1.m1();
        Brad353.m2();
    }
}
class Brad351{
    int a;
    static{System.out.println("static");}
    {System.out.println("a=" + a);}
    Brad351(){System.out.println("Brad351()");}
    void m1(){System.out.println("Brad:m1()");}
    static void m2(){System.out.println("Brad351:m2()");}
}
class Brad352{
    static{System.out.println("static");}
    {System.out.println("352");}
    Brad352(){System.out.println("Brad352()");}
    void m1(){System.out.println("Brad:m1()");}
    static void m2(){System.out.println("Brad352:m2()");}
}
class Brad353{
    static{System.out.println("static");}
    {System.out.println("353");}
    Brad353(){System.out.println("Brad353()");}
    void m1(){System.out.println("Brad:m1()");}
    static void m2(){System.out.println("Brad353:m2()");}
}
