/**
 * Created by henry on 2021/1/28.
 */
public class WordSearch_79 {
    public static void main(String[] args){
        char[][] board = {{'A','B','C','E'},{'S','F','E','S'},{'A','D','E','E'}};
        WordSearch_79 ws = new WordSearch_79();
        System.out.println(ws.exist(board, "ABCESEEEFS"));
    }

    public boolean exist(char[][] board, String word) {
        //loop every elements in board to start search word
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                //need a helper function to check if adjacent elements can construct a word
                if(helper(board,word,i,j,0))
                    return true;
            }
        }
        return false;
    }

    private boolean helper(char[][] board, String word, int row, int col,
                           int wordIdx){
        if(wordIdx == word.length())
            return true;
        if(row < 0 || row >= board.length || col < 0 || col >= board[0].length)
            return false;
        if(board[row][col] != word.charAt(wordIdx))
            return false;

        board[row][col] = '*';
        boolean exist =  helper(board, word, row + 1, col, wordIdx + 1) ||
                        helper(board, word, row - 1, col, wordIdx + 1) ||
                        helper(board, word, row, col + 1, wordIdx + 1) ||
                        helper(board, word, row, col - 1, wordIdx + 1);
        board[row][col] = word.charAt(wordIdx);
        return exist;
    }
}
