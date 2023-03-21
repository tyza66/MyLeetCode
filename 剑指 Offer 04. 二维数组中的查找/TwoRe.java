class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix.length==0||matrix[0].length==0) return false;
        int i=0,j=0;
        for(i=0;i<matrix.length;i++){
            if(matrix[i][0]>target) break;
            for(j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==target) return true;
                if(matrix[i][j]>target) break;
            }
        }
        return false;
    }
}