/**
 * Created by henry on 2020/11/2.
 */
public class ReverseString_344 {
    public static void main(String[] args){
        char[] input = {'h','e','l','l','o'};
        ReverseString_344 rs = new ReverseString_344();
        rs.reverseString(input);
        for(int i=0; i<input.length; i++){
            System.out.println(input[i] + ",");
        }
    }

    public void reverseString(char[] s) {
        if(s == null) return;
        char temp;
        for(int i=0,j=s.length-1; i<j; i++,j--){
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }
}
