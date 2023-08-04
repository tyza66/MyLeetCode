class Solution {
    public boolean exist(char[][] board, String word) {
        if (board.length == 0 || board[0].length == 0) {
            return false;
        }
        String[] split = word.split("");

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (split[0].equals(String.valueOf(board[i][j]))) {
                    boolean test = test(board,i, j,split);
                    if(test == true){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean test(char[][] board,int x,int y,String[] split){
        int now = 1;
        while (now < board.length) {
            boolean flag1 = false;
            //检查上面
            if((x-1>0)&&split[now].equals(String.valueOf(board[x-1][y]))){
                flag1 = true;
                x = x-1;
                now++;
            }
            //检查下面
            else if((x+1<board.length)&&split[now].equals(String.valueOf(board[x+1][y]))){
                flag1 = true;
                x = x+1;
                now++;
            }
            //检查左面
            else if((y-1>0)&&split[now].equals(String.valueOf(board[x][y-1]))){
                flag1 = true;
                y = y-1;
                now++;
            }
            //检查右面
            else if((y+1<board[0].length)&&split[now].equals(String.valueOf(board[x][y+1]))){
                flag1 = true;
                y = y+1;
                now++;
            }
            if(!flag1){
                return false;
            }
        }
        return true;
    }
}