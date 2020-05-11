/**
 * Created by blueskyee on 2016/2/17.
 */
public class StringToInteger_12 {

    public static void main(String[] args) {
        StringToInteger_12 stt = new StringToInteger_12();
        try {
            int intValue = stt.atoi("-147800000000000");
            System.out.print("int value:" + intValue);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int atoi (String str) throws Exception{
        if(str==null || str.length()<1)
            return 0;

        str = str.trim();

        int strIdx = 0;
        boolean isPositive = true;
        if(str.charAt(0) == '-'){
            isPositive = false;
            strIdx++;
        }else if(str.charAt(0) == '+'){
            isPositive = true;
            strIdx++;
        }

        double value = 0;
        while (strIdx<str.length() && str.charAt(strIdx)>='0'
                && str.charAt(strIdx)<='9'){
            value = value*10 + str.charAt(strIdx) - '0';
            strIdx++;
        }

        if(!isPositive){
            value = -value;
        }

        if(value > Integer.MAX_VALUE) {
            value = Integer.MAX_VALUE;
        }
        if(value < Integer.MIN_VALUE){
            value = Integer.MIN_VALUE;
        }
        return (int)value;
    }
}
