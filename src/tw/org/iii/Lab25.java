package tw.org.iii;

public class Lab25 {
    public static void main(String[] args){
        Lab251 obj1 = new Lab251();
        //obj2 = new Lab252();    抽象類別無法建構出其物件實體

        Lab252 obj2 = new Lab253();
        Lab252 obj3 = new Lab254();
        obj2.m2();
        obj3.m2();
    }
}
class Lab251 {
    int a;
    void m1(){}
    void m2(){}
}
abstract class Lab252 {
    int a;
    void m1(){}
    abstract void m2();  //有定義，卻無實做
}
class Lab253 extends Lab252 {
    void m2(){
        System.out.println("Lab253:m2(){}");
    }
}
class Lab254 extends Lab252 {
    void m2(){
        System.out.println("Lab254:m2(){}");
    }
}