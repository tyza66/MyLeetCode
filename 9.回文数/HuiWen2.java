class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        return new StringBuilder(s).reverse().toString().equals(s);
    }
}