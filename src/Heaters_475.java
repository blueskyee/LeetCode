import java.util.Arrays;

/**
 * Created by henry on 2018/12/24.
 */
public class Heaters_475 {
    public static void main(String[] args){
        int[] houses = {1,2,3,4};
        int[] heaters = {1,4};
        Heaters_475 heater = new Heaters_475();
        System.out.println(heater.findRadius(houses, heaters));
    }

    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        int res = Integer.MIN_VALUE;

        for(int house: houses){
            int idx = Arrays.binarySearch(heaters, house);
            if(idx < 0){
                idx = -(idx+1);
            }
            int left_heater_dist = (idx-1)>=0 ? house-heaters[idx-1] :Integer.MAX_VALUE;
            int right_heater_dist = idx<heaters.length ? heaters[idx]-house : Integer.MAX_VALUE;
            res = Math.max(res, Math.min(left_heater_dist, right_heater_dist));
        }

        return res;
    }
}
