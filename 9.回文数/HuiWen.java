class Solution {
    public static boolean isPalindrome(int x) {
		String a = String.valueOf(x);
		char[] myx = a.toCharArray();
		int i = 0,j = myx.length-1;
		boolean end = false;
		if(myx.length%2 == 1) {
			while(myx[i]==myx[j]&&i<j){
				i++;j--;
			}
			if(i==j) end = true;
		}
		else{
			while(myx[i]==myx[j]&&i<j){
				i++;j--;
			}
			if(i==j+1) end = true;
		}
		return end;
	}
}