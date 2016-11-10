package tw.org.iii;

public class Lab24 {
    public static void main(String[] args) {
        System.out.println(Person.getCounter());

        Person obj1 = new Person("Brad");
        Person obj2 = new Person("Peter");
        Person obj3 = new Person("Andy");
        System.out.println(obj1.name);
        System.out.println(Person.getCounter());

        obj3.sayYa();

    }
}
//建構式遠永只會被執行一次
class Person{
    String name;
    static private int counter; //可為計數器
    Person(String name){
        this.name = name;
        counter++;
    }
    void sayYa(){
        System.out.println(name + ":Ya");
    }
    static int getCounter(){
        return counter;
    }
}
//沒有static >> 物件級別!   要有物件才能用的方法
//有static >>沒有物件也能使用的方法

//建構式(){}第一道敘述句
//1.super或this
//2.//super