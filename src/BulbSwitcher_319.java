/**
 * Created by henry on 2021/3/7.
 */
public class BulbSwitcher_319 {
    public int bulbSwitch(int n) {
        int res = 0;
        int square = 1;
        int root = 1;
        while(square <= n){
            res++;
            root++;
            square = root * root;
        }
        return res;
    }
}
