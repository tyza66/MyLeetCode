class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] out = new int[2];
        int i=0,j=0;
        for(i=0;i<nums.length;i++){
            for(j=i;j<nums.length;j++){
                if(nums[i]+nums[j]== target){
                    out[0] = i;
                    out[1] = j;
                }
            }
        }
        return out;
    }
}