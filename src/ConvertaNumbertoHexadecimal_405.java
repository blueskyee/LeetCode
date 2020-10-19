/**
 * Created by henry on 2020/10/15.
 */
public class ConvertaNumbertoHexadecimal_405 {
    public static void main(String[] args){
        int input = -1;
        ConvertaNumbertoHexadecimal_405 cnh = new ConvertaNumbertoHexadecimal_405();
        System.out.println(cnh.toHex(input));
    }

    public String toHex(int num) {
        char[] map = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};

        if(num == 0) return "0";
        StringBuilder sb = new StringBuilder();
        while (num != 0){
            sb.append(map[num&15]);
            num = (num >>> 4);
        }
        return sb.reverse().toString();
    }

/*    public String toHex(int num) {
        StringBuilder sb = new StringBuilder();
        int remainder = 0;

        if(num == 0){
            return "0";
        }else if(num < 0){
            int digit = ~num;
            num = ~num - 1;
        }

        while(num > 0){
            remainder = num % 16;
            num /= 16;
            sb.append(digitToHex(remainder));
        }

        return sb.reverse().toString();
    }

    public String digitToHex(int num) {
        int  remainer = 0;
        String result;
        remainer = num % 16;
        if(remainer < 10){
            result =  String.valueOf(remainer);
        }else{
            switch(remainer){
                case 10:
                    result = "a";
                    break;
                case 11:
                    result = "b";
                    break;
                case 12:
                    result = "c";
                    break;
                case 13:
                    result = "d";
                    break;
                case 14:
                    result = "e";
                    break;
                case 15:
                    result = "f";
                    break;
                default:
                    result = "";
            }
        }

        return result;
    }*/

}
