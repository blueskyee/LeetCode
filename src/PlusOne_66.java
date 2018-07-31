import com.sun.org.apache.xpath.internal.operations.Plus;

/**
 * Created by henry on 2018/7/31.
 */
public class PlusOne_66 {
    public static void main(String[] args){
        int[] digits = {9};
        PlusOne_66 po = new PlusOne_66();
        System.out.println(po.plusOne(digits));
    }

    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1; i>=0; i--){
            if(digits[i]+1 == 10){
                digits[i] = 0;
                if(i==0){
                    int[] newAry = new int[digits.length+1];
                    newAry[0] = 1;
                    return newAry;
                }
            }else{
                digits[i] = digits[i]+1;
                break;
            }
        }
        return digits;
    }
}
