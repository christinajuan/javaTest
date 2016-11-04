package tw.org.iii;

import java.util.Arrays;

//homework2
public class PokerV3 {
    public static void main(String[] args){
        // 洗牌
        int[] poker = new int[52]; //poker[0] = 0,...
        for (int i=0; i<poker.length ; i++){
            poker[i] = i;
            //System.out.print(poker[i] + ",");
        }
        for (int v: poker){
        //    System.out.print(v + ",");
        }
        System.out.println();
        for(int j=51 ;j>0;j--){
            int po = (int)(Math.random()*j);
            int temp = poker[j];
            poker[j]=poker[po];
            poker[po]=temp;
            //System.out.print(poker[j] + ",");
        }
        System.out.println();
        for (int v: poker){
        //    System.out.print(v + ",");
        }

        // 發牌
        int[][] players = new int[4][13];
        for (int i =0; i<poker.length; i++){
            players[i%4][i/4] = poker[i];
        }

        for (int v:players[0]){
//            System.out.println(v);
        }

        // 攤牌(理牌)
        String[] suits = {"黑桃","紅心","方塊","梅花"};
        String[] values = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        for(int[] player : players){
            Arrays.sort(player);
            for (int card : player){
                System.out.print(suits[card/13] + values[card%13] +  "  ");
            }
            System.out.println();
        }
    }
}
