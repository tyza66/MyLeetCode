package org.example;

import java.util.HashMap;
import java.util.Stack;

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
        if(now == split.length) return true;
        char temp = board[x][y];
        board[x][y] = ' ';
        boolean res = false;
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        for(int i=0; i<4; i++){
            int newx = x + dx[i];
            int newy = y + dy[i];
            if(newx >= 0 && newx < board.length && newy >= 0 && newy < board[0].length && split[now].equals(String.valueOf(board[newx][newy]))){
                res = res || test(board,newx,newy,split,now+1);
            }
        }
        board[x][y] = temp;
        return res;
    }
}

//必须使用真正的回溯