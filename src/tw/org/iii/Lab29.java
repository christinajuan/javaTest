package tw.org.iii;

import sun.corba.Bridge;

public class Lab29 {
    public static void main(String[] args){
        Bird b1 = new Bird();
        try {
            b1.setLeg(2);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
class Bird {
    private int leg;
    void setLeg(int n) throws Exception {
        if(n<0 || n>2){
            throw new  Exception();
        }
        leg = n;
    }
}
