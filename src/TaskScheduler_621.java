import java.util.Arrays;

/**
 * Created by henry on 2021/3/18.
 */
public class TaskScheduler_621 {

    public int leastInterval(char[] tasks, int n) {
        int[] charArr = new int[26];
        for(char task:tasks){
            charArr[task - 'A']++;
        }
        Arrays.sort(charArr);
        int idx = 25;
        while(idx >= 0 && charArr[idx] == charArr[25])
            idx--;
        return Math.max(tasks.length, (charArr[25] - 1) * (n + 1) + 25 - idx);
    }
}
