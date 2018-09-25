/**
 * Created by henry on 2018/9/25.
 */
public class PowerofTwo_231 {
    public static void main(String[] args){
        int input = 4;
        PowerofTwo_231 pst = new PowerofTwo_231();
        System.out.println(pst.isPowerOfTwo(input));
    }

    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        } else{
            return (n&(n-1))==0;
            //return Integer.bitCount(n)==1;
        }
    }
}
