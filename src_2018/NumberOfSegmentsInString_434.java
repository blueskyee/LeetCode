/**
 * Created by henry on 2018/11/16.
 */
public class NumberOfSegmentsInString_434 {
    public static void main(String[] args){
        NumberOfSegmentsInString_434 nss = new NumberOfSegmentsInString_434();
        System.out.println(nss.countSegments("Hello, my name is John"));
    }

    public int countSegments(String s) {
        int res = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!=' ' && (i==0 || s.charAt(i-1)==' '))
                res++;
        }
        return res;
    }
}
