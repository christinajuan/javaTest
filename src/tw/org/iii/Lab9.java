package tw.org.iii;
public class Lab9 {
    public static void main(String[] args){
        int i=0;
        //for (首次執行敘述句;執行前的判斷(true);執行後的敘述句)
        // >>也可以用方法帶入當敘述句
        for (m1();;System.out.println("---")){
            if (i>=10) break;
            System.out.println(i++);
        }
    }
    static void m1(){
        System.out.println("Beauty");
    }
}
