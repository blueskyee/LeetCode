/**
 * Created by henry on 2018/10/21.
 */
public class ZigZagConversion_6 {
    public static void main(String[] args){
        String s = "PAYPALISHIRING";
        ZigZagConversion_6 zzc = new ZigZagConversion_6();
        System.out.println(zzc.convert(s, 3));
    }

    public String convert(String s, int numRows) {
        char[] chars = s.toCharArray();
        int sLen = chars.length;
        StringBuffer[] sb = new StringBuffer[numRows];
        for(int i=0; i<numRows; i++) sb[i] = new StringBuffer();

        int i=0;
        while(i < sLen){
            for(int v=0; v<numRows && i<sLen; v++){ //vertical down
                sb[v].append(chars[i++]);
            }
            for(int w=numRows-2; w>0 && i<sLen; w--){
                sb[w].append(chars[i++]);
            }
        }
        for(int y=1; y<numRows; y++){
            sb[0].append(sb[y]);
        }
        return sb[0].toString();
    }
}
