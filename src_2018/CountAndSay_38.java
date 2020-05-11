/**
 * Created by henry on 2018/7/26.
 */
public class CountAndSay_38 {
    public static void main(String[] args){
        CountAndSay_38 cas = new CountAndSay_38();
        System.out.println(cas.countAndSay(6));
    }

    public String countAndSay(int n) {
        String result = "1";
        for(int i=1; i<n; i++){
            StringBuilder sb = new StringBuilder();
            int curCnt = 1;
            for(int j=1; j<result.length(); j++){
                if(result.charAt(j) == result.charAt(j-1)){
                    curCnt++;
                }else{
                    sb.append(curCnt).append(result.charAt(j-1));
                    curCnt = 1;
                }
            }
            sb.append(curCnt).append(result.charAt(result.length()-1));
            result = sb.toString();
        }
        return result;
    }
}
