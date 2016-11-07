package tw.org.iii;

public class Lab26 {
    public static void main(String[] args){

    }
}
abstract class Lab261{
    void m1(){}
    abstract void m2();
}
interface Lab262{
    int a = 1;        //擁有屬性時，宣告同時要給值
    //void m1(){};    //只能定義，而無任何實做 >>無建構式
    void m2();        //方法必為public
}
class Lab263 implements Lab262 {
    public void m2(){}
}