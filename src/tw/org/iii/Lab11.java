package tw.org.iii;
//高斯定理
public class Lab11 {
    public static void main(String[] args){
        int i = 0, sum=0, n=10;
        while (i<=n){
            sum +=i++;
        }
//        for(i=0;i<=10;i++){
//            sum+=i;
//        }

        System.out.println("1 + 2 + ... + "+ n + " = " + sum);
    }
}
