class Solution {
	public static int maxArea(int[] height) {
		int na,nb;
		na=nb=0;
		int max = 0;
		for(int i=0,j=height.length-1;i<j;) {
			if((height[i]<height[j]?height[i]:height[j])*(j-i)>max) max = (height[i]<height[j]?height[i]:height[j])*(j-i);
			if(height[i]<height[j]) i++;
			else j--;
		}
		return max;
	}
}