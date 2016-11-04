package tw.org.iii;
//1~100 =>> 找出所有質數
public class homework1 {
    public static void main(String[] args){
        int number ;
        int counter=0;
        for(int i=1; i<=100; i++){
            int half=i/2;
            for(int j=1; j<=half; j++){
                number=i%j;
                if (number==0){
                    counter++;
                }
            }
            if (counter==1) {
                System.out.println(i);
            }
            counter=0;
        }
    }
}
