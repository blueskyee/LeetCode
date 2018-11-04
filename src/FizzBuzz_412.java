import java.util.ArrayList;
import java.util.List;

/**
 * Created by henry on 2018/11/4.
 */
public class FizzBuzz_412 {
    public static void main(String[] args){
        FizzBuzz_412 fb = new FizzBuzz_412();
        List<String> res = fb.fizzBuzz(25);
        for(int i=0; i<res.size(); i++){
            System.out.println(res.get(i));
        }
    }

    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(i%3==0 && i%5==0){
                res.add("FizzBuzz");
            }else if(i%3==0){
                res.add("Fizz");
            }else if(i%5==0){
                res.add("Buzz");
            }else{
                res.add(String.valueOf(i));
            }
        }
        return res;
    }
}
