/**
 * Author:Viper
 * Data:2021/3/11
 * description:
 */
public class problem12 {
    public boolean exist(char[][] board,String word){
        char[] words= word.toCharArray();
        boolean res = false;
        for(int i=0;i<board.length;i++){
            for (int j = 0; j <board[0].length ; j++) {
                res = dfs(board,words,i,j,0);
                if(res==true)
                    return res;
            }
        }
        return res;
    }

    private boolean dfs(char[][] board, char[] words, int i, int j, int k) {
        if(i<0 || i>=board.length || j<0 || j>=board[0].length||board[i][j]!=words[k])
            return false;
        if(k==words.length-1)
            return true;
        board[i][j]='\0';
        boolean res = dfs(board,words,i+1,j,k+1) || dfs(board,words,i-1,j,k+1) ||
                        dfs(board,words,i,j+1,k+1) || dfs(board,words,i,j-1,k+1);
        board[i][j]=words[k];
        return res;
    }
}

