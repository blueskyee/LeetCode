/**
 * Created by henry on 2020/12/13.
 */
public class TwoSumII_167 {
    public static void main(String[] args){
        int[] input = {2,7,11,15};
        TwoSumII_167 ts = new TwoSumII_167();
        System.out.println(ts.twoSum(input, 13));
    }

    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int left = 0;
        int right = numbers.length - 1;
        if(numbers==null || numbers.length < 2){
            return result;
        }
        while (left < right){
            if(numbers[left] + numbers[right] == target){
                result[0] = left + 1;
                result[1] = right + 1;
                break;
            }else if(numbers[left] + numbers[right] > target){
                right--;
            }else{
                left++;
            }
        }

        return result;

        //brute force
        /*int current = 0;
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                current = numbers[i] + numbers[j];
                if(current == target){
                    return new int[] {i+1, j+1};
                }else if(current > target){
                    break;
                }
            }
        }
        return null;*/
    }
}
