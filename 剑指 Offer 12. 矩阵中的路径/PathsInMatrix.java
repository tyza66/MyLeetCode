package org.example;

public class Main {
    public static void main(String[] args) {
        //System.out.println(new Solution().exist(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}}, "ABCB"));
        //System.out.println(new Solution().exist(new char[][]{{'a','b'}}, "ba"));
        //System.out.println(new Solution().exist(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}}, "SEE"));
        //["A","B","C","E"],["S","F","E","S"],["A","D","E","E"]
        System.out.println(new Solution().exist(new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'E', 'S'}, {'A', 'D', 'E', 'E'}}, "ABCESEEEFS"));
        //[["A","B","C","E"],["S","F","E","S"],["A","D","E","E"]]
        //System.out.println(new Solution().exist(new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'E', 'S'}, {'A', 'D', 'E', 'E'}}, "ABCEFSADEESE"));
        /*Solution.Way way = new Solution.Way();
        way.setWay(1,1,2);
        System.out.println(way.getWay(1,1));*/
    }
}

class Solution {
    public boolean exist(char[][] board, String word) {
        if (board.length == 0 || board[0].length == 0) {
            return false;
        }
        String[] split = word.split("");

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (split[0].equals(String.valueOf(board[i][j]))) {
                    boolean test = test(board, i, j, split,1);
                    if (test == true) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean test(char[][] board,int x,int y,String[] split, int now){
        //判断当前走到的长度是不是已经到头成功了
        if(now == split.length) return true;
        //将现在的位置的值保存下来，然后将其置为空，防止重复走
        char temp = board[x][y];
        board[x][y] = ' ';
        //定义返回值预设为false
        boolean res = false;
        //这四种组合代表着四种移动方向
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        //上下左右都走一下遍历
        for(int i=0; i<4; i++){
            //生成新的坐标
            int newx = x + dx[i];
            int newy = y + dy[i];
            //判断新的坐标是否越界，是否和下一个要走的值相等，如果相等就继续走
            if(newx >= 0 && newx < board.length && newy >= 0 && newy < board[0].length && split[now].equals(String.valueOf(board[newx][newy]))){
                //如果走到了头就返回true 前面加的res||是为了保证每次循环中只要有true值就保留
                res = res || test(board,newx,newy,split,now+1);
            }
        }
        //将原来的值还回去
        board[x][y] = temp;
        //返回结果
        return res;
    }
}

//必须使用真正的回溯
//必须上下左右全走一次 而不是自己找一条路走