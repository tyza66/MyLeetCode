package org.example;

/**
 * Author: tyza66
 * Date: 2023/8/4 16:26
 * Github: https://github.com/tyza66
 **/

class Arr {
    public static void main(String[] args) {
        new Arr().findKthLargest(new int[]{3,2,1,5,6,4},2);
    }

    public int findKthLargest(int[] nums, int k) {
        //快速排序
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]<nums[j]){
                    int temp = nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        //返回第k个
        return nums[k-1];
    }
}