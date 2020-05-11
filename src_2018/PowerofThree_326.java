/**
 * Created by henry on 2018/10/16.
 */
public class PowerofThree_326 {
    public static void main(String[] args){
        int input = 9;
        PowerofThree_326 pot = new PowerofThree_326();
        System.out.println(pot.isPowerOfThree(input));
    }

    public boolean isPowerOfThree(int n) {
        //3^20 > int.max(=2^31-1)
        int maxPowerofThreeInt = (int)Math.pow(3,19);
        return (n>0 && maxPowerofThreeInt%n==0);
    }
}
