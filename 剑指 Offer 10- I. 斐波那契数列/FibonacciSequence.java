class Solution {
    //通过递归计算出斐波那契数列的第n项
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }else{
            return fib(n-1)+fib(n-2);
        }
    }
}

//这种解法会超时