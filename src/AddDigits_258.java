/**
 * Created by henry on 2020/6/9.
 */
public class AddDigits_258 {
    public static void main(String[] args){
        int input = 1116;
        AddDigits_258 ad = new AddDigits_258();
        System.out.println(ad.addDigits(input));
        System.out.println(ad.addDigitsLoop(input));
    }

    public int addDigits(int num) {
        if(num == 0) return 0;
        return (num - 1) % 9 + 1;
    }

    public int addDigitsLoop(int num) {
        if(num < 10) return num;
        while(num >= 10){
            int tmp = 0;
            while (num > 0){
                tmp += num % 10;
                num /= 10;
            }
            num = tmp;
        }
        return num;
    }
}
