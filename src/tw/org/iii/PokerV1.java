package tw.org.iii;
public class PokerV1 {
    public static void main(String[] args){
        // 洗牌
        int[] poker = new int[52]; //poker[0] = 0,...
        for (int i=0; i<poker.length ; i++){

            int temp = (int)(Math.random()*poker.length);
            //檢查機制
            boolean isRepeat = false;
            for (int j=0; j<i ; j++){
                if (poker[j]==temp){
                    //此時重複了
                    isRepeat = true;
                    break;
                }
            }
            if (isRepeat){
                i--;
            }else {
                poker[i] = temp;
                System.out.println(poker[i]);
            }

        }
        // 發牌
        // 攤牌(理牌)
    }
}
