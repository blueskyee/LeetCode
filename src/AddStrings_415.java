/**
 * Created by henry on 2018/11/26.
 */
public class AddStrings_415 {
    public static void main(String[] args){
        AddStrings_415 as = new AddStrings_415();
        System.out.println(as.addStrings("1234", "12345"));
    }

    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for(int i=num1.length()-1, j=num2.length()-1; i>=0 || j>=0; i--,j--){
            int x = i < 0 ? 0 : num1.charAt(i)-'0';
            int y = j < 0 ? 0 : num2.charAt(j)-'0';
            sb.append((x+y+carry) % 10);
            carry = (x+y+carry) / 10;
        }
        if(carry>0){
            sb.append(1);
        }

        return sb.reverse().toString();
    }

/*    public String addStrings_2020(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for(int i=num1.length()-1,j=num2.length()-1; i>=0 || j>=0; i--,j--){
            int x = i < 0 ? 0 : num1.charAt(i)-'0';
            int y = j < 0 ? 0 : num2.charAt(j)-'0';
            sb.append((x+y+carry) % 10);
            carry = (x+y+carry) / 10;
        }
        if(carry > 0){
            sb.append(1);
        }

        return sb.reverse().toString();
    }*/
}
