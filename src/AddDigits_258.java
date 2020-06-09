/**
 * Created by henry on 2020/6/9.
 */
public class AddDigits_258 {
    public static void main(String[] args){
        AddDigits_258 ad = new AddDigits_258();
        System.out.println(ad.addDigits(112));
    }

    public int addDigits(int num) {
        if(num == 0) return 0;
        return num == 9 ? 9 : num%9;
    }
}
