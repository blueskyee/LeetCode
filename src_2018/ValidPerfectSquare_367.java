/**
 * Created by henry on 2018/10/31.
 */
public class ValidPerfectSquare_367 {
    public static void main(String[] args){
        ValidPerfectSquare_367 vps = new ValidPerfectSquare_367();
        System.out.println(vps.isPerfectSquare(4));
    }

    public boolean isPerfectSquare(int num) {
        long i = 1;
        while(num>0){
            num -= i;
            i+=2;
        }
        return num==0;
    }
}
