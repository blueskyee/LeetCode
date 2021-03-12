import java.util.ArrayList;
import java.util.List;

/**
 * Created by henry on 2021/3/11.
 */
public class BinaryWatch_401 {

    public List<String> readBinaryWatch(int num) {
        List<String> res = new ArrayList<>();
        for(int h = 0; h < 12; h++){
            for(int m = 0; m < 60; m++){
                if(Integer.bitCount(h) + Integer.bitCount(m) == num){
                    res.add(Integer.toString(h) + ":" +
                            (m < 10 ? "0" + Integer.toString(m) : Integer.toString(m)));
                }
            }
        }
        return res;
    }
}
