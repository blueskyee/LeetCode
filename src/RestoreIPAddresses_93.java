import java.util.ArrayList;
import java.util.List;

/**
 * Created by henry on 2021/2/23.
 */
public class RestoreIPAddresses_93 {
    public static void main(String[] args){
        String input = "25525511135";
        RestoreIPAddresses_93 ri = new RestoreIPAddresses_93();
        System.out.println(ri.restoreIpAddresses(input));
    }

    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        restore(res, "", s, 0);
        return res;
    }

    private void restore(List<String> res, String path, String s, int k){
        if(s.isEmpty() || k == 4){
            if(s.isEmpty() && k == 4)
                res.add(path.substring(1));
            return;
        }

        for(int i = 1; i <= (s.charAt(0) == '0' ? 1: 3) && i <= s.length(); i++){
            int ipPart = Integer.valueOf(s.substring(0,i));
            if(ipPart <= 255){
                restore(res, path + "." + s.substring(0,i), s.substring(i), k + 1);
            }
        }
    }
}
