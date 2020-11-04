import java.util.HashSet;

/**
 * Created by henry on 2020/11/4.
 */
public class ValidSudoku_36 {
    public static void main(String[] args){
        char[][] input = {{'5','3','.','.','7','.','.','.','.'}
                            ,{'6','.','.','1','9','5','.','.','.'}
                            ,{'.','9','8','.','.','.','.','6','.'}
                            ,{'8','.','.','.','6','.','.','.','3'}
                            ,{'4','.','.','8','.','3','.','.','1'}
                            ,{'7','.','.','.','2','.','.','.','6'}
                            ,{'.','6','.','.','.','.','2','8','.'}
                            ,{'.','.','.','4','1','9','.','.','5'}
                            ,{'.','.','.','.','8','.','.','7','9'}};
                            
        ValidSudoku_36 vs = new ValidSudoku_36();
        System.out.print(vs.isValidSudoku(input));
    }

    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<String>();

        char cur;
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                cur = board[i][j];
                if(cur == '.'){
                    continue;
                }else if(!seen.add(cur + " in row " + i) ||
                        !seen.add(cur + " in column " + j) ||
                        !seen.add(cur + " in block " + i/3 + "-" + j/3)){
                    return false;
                }
            }
        }
        return true;
    }
}
