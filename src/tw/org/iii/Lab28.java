package tw.org.iii;
// Exception : 例外/異常
public class Lab28 {
    public static void main(String[] args){
        int a = 10,b = 0;
        int[] d = {0,1,2,3};
        try {
            int c = a/b;
            System.out.println(d[4]);

        }catch (ArithmeticException ae){
            System.out.println("ok1");
        }catch (RuntimeException ae){
            System.out.println("ok2");
        }
        System.out.println("Game Over");
    }
}
//RuntimeException 編譯時可不用加try/catch
//其他Exception 都一定要寫try/catch
//例外中有父子關係，小範圍要擺前面