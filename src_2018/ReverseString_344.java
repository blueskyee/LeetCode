/**
 * Created by henry on 2018/10/9.
 */
public class ReverseString_344 {
    public static void main(String[] args){
        String input = "A man, a plan, a canal: Panama";
        ReverseString_344 rs = new ReverseString_344();
        System.out.println(rs.reverseString(input));
    }

    public String reverseString(String s) {
        char[] sAry = s.toCharArray();
        int middle = sAry.length/2;
        char temp;
        for(int i=0; i<middle; i++){
            temp = sAry[i];
            sAry[i] = sAry[sAry.length-(i+1)];
            sAry[sAry.length-(i+1)] = temp;
        }
        return String.valueOf(sAry);
    }
}
