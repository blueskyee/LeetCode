/**
 * Created by henry on 2018/12/18.
 */
public class NumberComplement_476 {
    public static void main(String[] args){
        int input = 5;
        NumberComplement_476 nc = new NumberComplement_476();
        System.out.println(nc.findComplement(input));
    }

    public int findComplement(int num) {
        int i=0;
        int j=0;
        while(i<num){
            i += Math.pow(2,j);
            j++;
        }
        return i-num;
    }
}
