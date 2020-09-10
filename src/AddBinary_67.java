/**
 * Created by henry on 2020/9/9.
 */
public class AddBinary_67 {
    public static void main(String[] args){
        String a = "11";
        String b = "1";

        AddBinary_67 ab = new AddBinary_67();
        System.out.println(ab.addBinary(a,b));
    }

    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for(int i=a.length()-1,j=b.length()-1; i>=0 || j>=0; i--,j--){
            int sum = carry;
            if(i >= 0)
                sum += a.charAt(i) - '0';
            if(j >= 0)
                sum += b.charAt(j) - '0';
            sb.append(sum % 2);
            carry = sum / 2;
        }

        if(carry == 1)
            sb.append('1');
        return sb.reverse().toString();

        //brute force version
        /*int aLen = a.length();
        int bLen = b.length();

        StringBuilder sb = new StringBuilder();
        boolean carry = false;
        for(int i=aLen-1, j=bLen-1; i>=0 && j>=0; i--, j--){
            if(a.charAt(i)=='0' && b.charAt(j)=='0'){
                if(carry){
                    sb.append('1');
                }else{
                    sb.append('0');
                }
                carry = false;
            }else if(a.charAt(i)=='1' && b.charAt(j)=='1') {
                if(carry){
                    sb.append('1');
                }else{
                    sb.append('0');
                }
                carry = true;
            }else{
                if(carry){
                    sb.append('0');
                }else{
                    sb.append('1');
                }
            }
        }

        if(aLen == bLen){
            if(carry){
                sb.append('1');
            }
        }else{
            if(aLen > bLen){
                for(int i=aLen-bLen-1; i>=0; i--){
                    if(a.charAt(i) == '0'){
                        if(carry){
                            sb.append('1');
                        }else{
                            sb.append('0');
                        }
                        carry = false;
                    }else{
                        if(carry){
                            sb.append('0');
                            carry = true;
                        }else{
                            sb.append('1');
                        }
                    }
                }
            }else{
                for(int i=bLen-aLen-1; i>=0; i--){
                    if(b.charAt(i) == '0'){
                        if(carry){
                            sb.append('1');
                        }else{
                            sb.append('0');
                        }
                        carry = false;
                    }else{
                        if(carry){
                            sb.append('0');
                            carry = true;
                        }else{
                            sb.append('1');
                        }
                    }
                }
            }

            if(carry)
                sb.append('1');
        }

        return sb.reverse().toString();*/
    }
}
