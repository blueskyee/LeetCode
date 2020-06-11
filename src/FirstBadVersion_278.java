/**
 * Created by henry on 2020/6/11.
 */
public class FirstBadVersion_278 {

    public int firstBadVersion(int n) {
        //api: isBadVersion
        int start = 1;
        int end = n;
        while(start < end){
            int middle = start + (end - start)/2;
            if(!isBadVersion(middle)) {
                start = middle + 1;
            }else{
                end = middle;
            }
        }
        return start;
    }

    public boolean isBadVersion(int n){
        return true;
    }
}