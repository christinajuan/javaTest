package tw.org.iii;

import java.time.LocalDate;
import java.time.chrono.MinguoDate;

public class hw_calendar {
    public static void main(String[] args){
        int year = 2016;
        int month = 2;
        //int monthDay=30;
        switch (month){
            case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                System.out.println("31");
                //monthDay=31;
                break;
            case 4:case 6:case 9:case 11:
                System.out.println("30");
                break;
            case 2:
                if (year % 4 == 0){
                    if (year % 100 == 0){
                        if (year % 400 == 0){
                            System.out.println("29");
                        }else{
                            System.out.println("28");
                        }

                    }else{
                        System.out.println("29");
                    }
                }else{
                    System.out.println("28");
                }

                break;
        }
        System.out.print("日 一 二 三 四 五 六");
//        switch (monthDay){
//            case 31:
//                for(int i=1; i<31; i++){
//                    System.out.printf("%2d ", i);
//                }
//        }



    }
}
