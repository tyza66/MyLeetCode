class Solution {
    public String longestPalindrome(String s) {
        String longest = ""+s.charAt(0);
        int i = 0,i2 = 0;
        String s2 = "",s3 = "";
        //找除了单个字母和空串以外的对称的字串
        //先找到俩一样的字母之后截取这俩一样的字母之间的字符串看看是不是对称
        for(i=1;i<=s.length()-1;i++) {
            int now = 0;
            while((i2=s.indexOf((""+s.charAt(i-1)),i+now))!=-1){
                s2 = s.substring(i-1,i2+1);
                if(s2.equals(new StringBuffer(s2).reverse().toString())){
                    if(s2.length()>longest.length()){
                        longest = s2;
                    }
                }
                //从后往前找最长的一个，但是这样其实会忽略掉几个，从前往后继续找的时候也许会遇到部分
                //其实还是会被忽略掉一些，所以这块其实是不可行的，机关解决了忽略掉几个的问题，时间复杂度还是太大，无法成功通过
                int end = s.lastIndexOf((""+s.charAt(i-1)));
                s3 = s.substring(i-1,end+1);
                if(s3.equals(new StringBuffer(s3).reverse().toString())){
                    if(s3.length()>longest.length()){
                        longest = s3;
                        continue;
                    }
                }
                now++;
            }
        }
        return longest;
    }
}