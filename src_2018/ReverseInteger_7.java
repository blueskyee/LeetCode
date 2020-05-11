/**
 * Created by henry on 2018/7/19.
 */
public class ReverseInteger_7 {
    public static void main(String[] args) {
        int input = 1534236469;
        ReverseInteger_7 ri = new ReverseInteger_7();
        System.out.print(ri.reverse(input));
    }

    public int reverse(int x) {
        try{
            long reverseInt = 0;
            while(x != 0){
                reverseInt = reverseInt * 10 + x % 10;
                x = x / 10;
            }
            if (reverseInt > Integer.MAX_VALUE | reverseInt < Integer.MIN_VALUE)
                return 0;
            else
                return (int)reverseInt;
        }catch (Exception e){
            return 0;
        }
    }
}
