import java.util.ArrayList;
import java.util.List;

/**
 * Created by henry on 2021/1/14.
 */
public class WordSearchII_212 {
    public class TrieNode {
        public String word;
        TrieNode[] children = new TrieNode[26];
        public TrieNode(){}
    }

    public List<String> findWords(char[][] board, String[] words) {
        //step1: build a trie by words
        TrieNode root = buildTrie(words);

        //step2: loop every element on board to check if it could be search on trie
        List<String> res = new ArrayList<>();
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                checkIsWord(board, new boolean[board.length][board[0].length], root, i, j, res);
            }
        }

        return res;
    }

    private void checkIsWord(char[][] board, boolean[][] visited,
                                TrieNode curNode, int i, int j,
                                List<String> res){
        if(visited[i][j] || curNode.children[board[i][j] - 'a'] == null){
            return;
        }
        visited[i][j] = true;
        curNode = curNode.children[board[i][j] - 'a'];

        if(curNode.word != null){
            res.add(curNode.word);
            curNode.word = null;
        }
        if(i > 0)
            checkIsWord(board, visited, curNode, i - 1, j, res);
        if(i < board.length - 1)
            checkIsWord(board, visited, curNode, i + 1, j, res);
        if(j > 0)
            checkIsWord(board, visited, curNode, i, j - 1, res);
        if(j < board[0].length - 1)
            checkIsWord(board, visited, curNode, i, j + 1, res);
        visited[i][j] = false;
    }

    private TrieNode buildTrie(String[] words){
        TrieNode root = new TrieNode();
        for(int i = 0; i < words.length; i++){
            String word = words[i];
            TrieNode temp = root;
            for(int j = 0; j < word.length(); j++){
                if(temp.children[word.charAt(j) - 'a'] == null){
                    temp.children[word.charAt(j) - 'a'] = new TrieNode();
                }
                temp = temp.children[word.charAt(j) - 'a'];
            }
            temp.word = word;
        }
        return root;
    }
}
