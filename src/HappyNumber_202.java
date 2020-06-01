import java.util.HashSet;

/**
 * Created by henry on 2020/6/1.
 */
public class HappyNumber_202 {

    public static void main(String[] args){
        HappyNumber_202 hn = new HappyNumber_202();
        System.out.println(hn.isHappy(19));
    }

    public boolean isHappy(int n) {
        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(n);

        while (n != 1){
            int curSqr = 0;
            while (n > 0){
                int lastDigit = n % 10;
                curSqr += lastDigit*lastDigit;
                n /= 10;
            }
            n = curSqr;

            if(hs.contains(n))
                return false;
            hs.add(n);
        }
        return true;
    }
}
