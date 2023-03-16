class Solution {
    public int lengthOfLongestSubstring(String s) {
        int long1 = 0;
        LinkedList<String> list = new LinkedList<>();
        String[] ones = s.split("");
        for(String one:ones){
            if(!list.contains(one)&&!one.equals("")){
                list.add(one);
                if(list.size()>long1){
                    long1 = list.size();
                }
            }else{
                if(list.size()>0){
                    while(!list.poll().equals(one)){
                        
                    }
                    list.add(one);
                }
            }
        }
        return long1;
    }
}