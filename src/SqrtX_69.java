/**
 * Created by henry on 2018/8/2.
 */
public class SqrtX_69 {
    public static void main(String[] args){
        int input = 8;
        SqrtX_69 sx = new SqrtX_69();
        System.out.println(sx.mySqrt(input));
    }

    public int mySqrt(int x) {
        Double sqrt_x = Math.sqrt((double)x);
        return sqrt_x.intValue();
    }
}
