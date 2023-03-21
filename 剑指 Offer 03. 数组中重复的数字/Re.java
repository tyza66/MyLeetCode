class Solution {
    public int findRepeatNumber(int[] nums) {
        for(int i=0;i<=nums.length-1;i++){
            for(int j=i+1;j<=nums.length-1;j++){
                if(nums[j]==nums[i]){
                    return nums[j];
                }
            }
        }
        return 0;
    }
}