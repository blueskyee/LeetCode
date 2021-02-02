import java.util.HashMap;
import java.util.Map;

/**
 * Created by henry on 2021/2/2.
 */
public class FractiontoRecurringDecimal_166 {
    public static void main(String[] args){
        FractiontoRecurringDecimal_166 fr = new FractiontoRecurringDecimal_166();
        System.out.println(fr.fractionToDecimal(4, 333));
    }

    public String fractionToDecimal(int numerator, int denominator) {
        StringBuilder res = new StringBuilder();
        //result is positive or negative
        if((long)numerator * (long)denominator < 0){
            res.append("-");
        }
        long num = Math.abs((long)numerator);
        long den = Math.abs((long)denominator);

        //divide
        res.append(num/den);
        num %= den;
        if(num == 0)
            return res.toString();

        //add "."
        res.append(".");

        //need a Map to record repeat part
        Map<Long, Integer> map = new HashMap<>();
        map.put(num, res.length());

        //fraction part
        while (num != 0){
            num *= 10;
            res.append(num/den);
            num %= den;
            if(map.containsKey(num)){
                int idx = map.get(num);
                res.insert(idx, "(");
                res.append(")");
                break;
            }else{
                map.put(num, res.length());
            }
        }

        return res.toString();
    }
}
