class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        double[] array = new double[length];
        int i = 0;
        for(i=1;i<=nums1.length;i++){
            array[i-1] = nums1[i-1];
        }
        for(i=i;i<=nums1.length+nums2.length;i++){
            array[i-1] = nums2[i-nums1.length-1];
        }
        Arrays.sort(array);
        if(length%2!=0){
            return array[length/2];
        }else{
            return (array[length/2-1]+array[length/2])/2;
        }
    }
}