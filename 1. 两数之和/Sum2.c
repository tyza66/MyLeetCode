class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i,j;
        int[] out = new int[2];
        for(i=0;i<nums.length-1;i++)
        {
            for(j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target){
                    out[0] = i;out[1] = j;
                    return out;
                }
            }
        }
        return null;
    }
}