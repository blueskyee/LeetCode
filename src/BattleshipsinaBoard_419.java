/**
 * Created by henry on 2021/2/3.
 */
public class BattleshipsinaBoard_419 {
    public static void main(String[] args){

    }

    public int countBattleships(char[][] board) {
        if(board == null) return 0;
        int count = 0;

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == '.') continue;
                if(i > 0 && board[i-1][j] == 'X') continue;
                if(j > 0 && board[i][j-1] == 'X') continue;
                count++;
            }
        }
        return count;
    }
}
