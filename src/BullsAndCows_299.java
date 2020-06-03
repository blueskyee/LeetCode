import javax.swing.plaf.synth.SynthTabbedPaneUI;

/**
 * Created by henry on 2020/6/3.
 */
public class BullsAndCows_299 {
    public static void main(String[] args){
        BullsAndCows_299 bac = new BullsAndCows_299();
        System.out.println(bac.getHint("1807", "7810"));
    }

    public String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        int[] numIdxCnt = new int[10];

        for(int i=0; i<secret.length(); i++){
            if(secret.charAt(i) == guess.charAt(i)){
                bulls++;
            }else{
                numIdxCnt[secret.charAt(i) - '0']++;
            }
        }
        for(int i=0; i<guess.length(); i++){
            if(guess.charAt(i) != secret.charAt(i) && numIdxCnt[guess.charAt(i)-'0'] > 0){
                cows++;
                numIdxCnt[guess.charAt(i) - '0']--;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(bulls).append('A').append(cows).append('B');
        return sb.toString();
    }
}
