/**
 * Created by henry on 2021/2/14.
 */
public class StringtoInteger_8 {
    public static void main(String[] args){
        String input = "42";
        StringtoInteger_8 si = new StringtoInteger_8();
        System.out.println(si.myAtoi(input));
    }

    public int myAtoi(String s) {
        s = s.trim();
        if(s.isEmpty()) return 0;

        int sign = 1;
        int idx = 0;
        int res = 0;
        if(s.charAt(0) == '+' || s.charAt(0) == '-'){
            sign = (s.charAt(0) == '+') ? 1 : -1;
            idx++;
        }
        for(int i = idx; i < s.length(); i++){
            char cur = s.charAt(i);
            if(cur >= '0' && cur <= '9'){
                if(res > Integer.MAX_VALUE / 10 ||
                        (res == Integer.MAX_VALUE / 10 && cur - '7' > 0)){
                    res = (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                    break;
                }
                res = res * 10 + cur - '0';
            }else{
                break;
            }
        }
        return res * sign;
    }
}
