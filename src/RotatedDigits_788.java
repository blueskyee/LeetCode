/**
 * Created by henry on 2021/1/17.
 */
public class RotatedDigits_788 {
    public static void main(String[] args){
        int input = 100;
        RotatedDigits_788 rd = new RotatedDigits_788();
        System.out.println(rd.rotatedDigits(input));
    }

    //0: invalid number
    //1: valid but same number
    //2: valid
    public int rotatedDigits(int N) {
        int count = 0;
        int[] arr = new int[N + 1];
        for(int i = 0; i <= N; i++){
            if(i < 10){
                if(i == 0 || i == 1 || i == 8){
                    arr[i] = 1;
                }else if(i == 2 || i == 5 || i == 6 || i == 9){
                    arr[i] = 2;
                    count++;
                }
            }else{
                int a = arr[i / 10], b = arr[i % 10];
                if(a == 1 && b == 1){
                    arr[i] = 1;
                }else if(a >= 1 && b >= 1){
                    arr[i] = 2;
                    count++;
                }
            }
        }
        return count;
    }
}
