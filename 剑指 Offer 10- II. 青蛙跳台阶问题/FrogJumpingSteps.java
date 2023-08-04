class Solution {
    //一只青蛙一次可以跳一阶或两阶 求一共多少种跳法
    public int numWays(int n) {
        if(n==0||n==1){
            return 1;
        }
        else{
            //递归加上回退一阶或两阶的跳法一共多少种
            return numWays(n-1)+numWays(n-2);
        }
    }
}
//递归又一次超时