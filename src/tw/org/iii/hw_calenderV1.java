package tw.org.iii;
public class hw_calenderV1 {
    public static void main(String[] args) {
        java.util.Scanner sc;//宣告一個sc變數，型態為Scanner
        sc = new java.util.Scanner(System.in);//建立Scanner物件並存放在sc變數中
        System.out.println("請輸入年:");//列印提示
        int year = sc.nextInt();//保存使用者輸入的年份
        System.out.println("請輸入月:"); //列印提示
        int month = sc.nextInt();//保存使用者輸入的月份
        System.out.printf("你輸入的年:%d年，你輸入的月:%d月\n", year, month);
        System.out.println("\n日 一 二 三 四 五 六");
        java.util.Date first;
        first = new java.util.Date(year - 1900, month - 1, 1);
        for (int i = 0; i < first.getDay(); i++)//如果第一天為星期x，空出xx天
        {
            System.out.print("   ");
        }

        for (int i = 1; i <= 31; i++) {
            java.util.Date d;
            d = new java.util.Date(year - 1900, month - 1, i);

            if (d.getMonth() + 1 != month)//物件的月份，不等於使用者輸入的月份
            {
                break;//中止迴圈
            }
            System.out.printf("%2d ", i);

            if (d.getDay() == 6)//星期六換行
            {
                System.out.println();
            }
        }
    }
}
