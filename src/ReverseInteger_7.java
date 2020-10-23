/**
 * Created by henry on 2020/10/23.
 */
public class ReverseInteger_7 {
    public static void main(String[] args){
        int input = -1234;
        ReverseInteger_7 ri = new ReverseInteger_7();
        System.out.println(ri.reverse(input));
    }

    public int reverse(int x) {
        int res = 0;
        while (x != 0){
            int temp = res * 10 + x % 10;
            if((temp - x % 10) / 10 != res){  //overflow
                return 0;
            }
            res = temp;
            x = x / 10;
        }

        return res;
    }
}
