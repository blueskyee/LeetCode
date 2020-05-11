/**
 * Created by henry on 2018/9/12.
 */
public class Numberof1Bits_191 {
    public static void main(String[] args){
        Numberof1Bits_191 nb = new Numberof1Bits_191();
        System.out.println(nb.hammingWeight(129));
    }

    public int hammingWeight(int n) {
        //solution 1
        //return Integer.bitCount(n);

        //solution 2
        int numberOf1Bit = 0;
        while (n > 0){
            n = n & (n-1);
            numberOf1Bit++;
        }
        return numberOf1Bit;
    }
}
