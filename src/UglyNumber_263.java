/**
 * Created by henry on 2020/6/10.
 */
public class UglyNumber_263 {
    public static void main(String[] args){
        UglyNumber_263 un = new UglyNumber_263();
        System.out.println(un.isUgly(6));
    }

    public boolean isUgly(int num) {
        for(int i=2; i<6; i++){
            if(num % i == 0)
                num /= i;
        }
        return num == 1;
    }
}
