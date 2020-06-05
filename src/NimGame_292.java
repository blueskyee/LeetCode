/**
 * Created by henry on 2020/6/5.
 */
public class NimGame_292 {
    public static void main(String[] args){
        NimGame_292 ng = new NimGame_292();
        System.out.println(ng.canWinNim(88));
    }

    public boolean canWinNim(int n) {
        if(n%4 == 0)
            return false;
        return true;
    }
}
