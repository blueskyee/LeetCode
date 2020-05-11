/**
 * Created by henry on 2018/10/21.
 */
public class PowerofFour_342 {
    public static void main(String[] args){
        int num = 8;
        PowerofFour_342 pof = new PowerofFour_342();
        System.out.println(pof.isPowerOfFour(num));
    }

    public boolean isPowerOfFour(int num) {
        //0x55555555 = 1010101010101010101010101010101 in binary with a length of 32
        return num>0 && (num&(num-1))==0 && (num & 0x55555555)!=0;
    }
}
