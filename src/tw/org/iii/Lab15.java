package tw.org.iii;
public class Lab15 {
    public static void main(String[] args){
        int [][] a;
        a = new int[3][4];
//        >>傳統for迴圈
//        for (int i=0; i<a.length; i++){
//            for (int j=0; j<a[i].length; j++){
//                System.out.print(a[i][j] + "  ");
//            }
//            System.out.println();
//        }
        for (int[] v:a){
            for(int x:v){
                System.out.print(x + "  ");
            }
            System.out.println();
        }
    }
}