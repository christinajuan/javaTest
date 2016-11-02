package tw.org.iii;
//"黨名"一定要跟"public的名字"一樣，一個檔案最多只能有一個public class
public class Bike {
    //Member: 成員 > 屬性/方法
    //public > protect > <沒有> > private  --- 封裝
    private double speed;
    Bike(){
        System.out.println("Bike()");
    }
    Bike(int gear){
        System.out.println("Bika(int)");
    }
    void upSpeed(){
        speed = speed<1?1:speed*1.2;
        //speed+=0.2;
    }
    //參數的個數，型別
    //若呼叫時型別不同，會自動轉型
    void upSpeed(int gear){
        speed = speed<1?1:speed*(1.2+gear);
    }
    void upSpeed(double gear){
        speed = speed<1?1:speed*(gear);
    }
    void downSpeed(){
        speed = speed<1?0:speed*0.7;
        //speed+=0.4;
    }
    double getSpeed(){
        return speed;
    }
}
