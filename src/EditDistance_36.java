/**
 * Created by blueskyee on 2016/3/4.
 */
public class EditDistance_36 {

    public static void main(String[] args) {
        String word1 = "g";
        String word2 = "def";

        try {
            int editDistance = EditDistance_36.minDistance(word1,word2);
            System.out.print("edit distance:" + editDistance);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /***
    solve by dynamic programming
     1. if x==y, d[i][j] = d[i-1][j-1]
     2. if x!=y, d[i][j] = min. of following three conditions
        2.1 d[i-1][j] + 1, delete x
        2.2 d[i][j-1] + 1, insert y
        2.3 d[i-1][j-1] + 1, replace x with y
    ***/
    public static int minDistance(String word1, String word2) throws Exception{
        int word1Len = word1.length();
        int word2Len = word2.length();
        int [][] disMatrix = new int[word1Len+1][word2Len+1];
        for(int i=0; i<=word1Len; i++)
            disMatrix[i][0] = i;
        for(int i=0; i<=word2Len; i++)
            disMatrix[0][i] = i;
        for(int i=1; i<=word1Len; i++){
            for(int j=1; j<=word2Len; j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    disMatrix[i][j] = disMatrix[i-1][j-1];
                }else{
                    int minDis = Math.min(disMatrix[i-1][j],disMatrix[i][j-1]);
                    minDis = Math.min(minDis,disMatrix[i-1][j-1]);
                    disMatrix[i][j] = minDis + 1;
                }
            }
        }

        return disMatrix[word1Len][word2Len];
    }
}
