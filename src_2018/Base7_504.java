/**
 * Created by henry on 2018/12/29.
 */
public class Base7_504 {
    public static void main(String[] args){
        int input = 100;
        Base7_504 b7 = new Base7_504();
        System.out.println(b7.convertToBase7(input));
    }

    public String convertToBase7(int num) {
        if(num<0) return "-" + convertToBase7(-num);
        if(num<7) return num + "";
        return convertToBase7(num / 7) + num%7;
    }
}
