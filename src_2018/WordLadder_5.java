import java.util.HashSet;
import java.util.LinkedList;

/**
 * Created by blueskyee on 2016/2/13.
 */
public class WordLadder_5 {

    public static void main(String[] args) {
        String startWord = "abcd";
        String endWord = "abef";
        HashSet<String> dict = new HashSet<String>();
        dict.add("abed");
        dict.add("abef");

        try {
            WordLadder_5 wl = new WordLadder_5();
            int wordDistance = wl.ladderLength(startWord,endWord,dict);
            System.out.print("word distance: " + wordDistance);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int ladderLength ( String start , String end , HashSet<String > dict ) throws Exception{
        if(dict.size()==0)
            return 0;

        LinkedList<String> wordQueue = new LinkedList<String>();
        LinkedList<Integer> distanceQueue = new LinkedList<Integer>();

        wordQueue.add(start);
        distanceQueue.add(0);

        while (!wordQueue.isEmpty()){
            String currWord = wordQueue.pop();
            int currDist = distanceQueue.pop();

            if(currWord.equals(end)){
                return  currDist;
            }

            for(int i=0; i<currWord.length(); i++){
                char[] currCharArr = currWord.toCharArray();
                for(char charI='a'; charI<='z'; charI++){
                    currCharArr[i] = charI;
                    String newWord = new String(currCharArr);
                    if(dict.contains(newWord)){
                        wordQueue.add(newWord);
                        distanceQueue.add(currDist+1);
                        //to prevent loop
                        dict.remove(newWord);
                    }
                }
            }

        }
        return 0;
    }
}
