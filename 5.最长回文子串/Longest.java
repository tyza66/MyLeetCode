class Solution {
    public String longestPalindrome(String s) {
        if(s.equals("")) return "";
        //如果使用那个暴力的方法时间复杂度太高了
        //所以那个报使，必须用优化的算法
        //那这样，我们使用从中间扩散的方法
        String[] p = s.split("");
        String out = "";
        //情况1：核心是一个
        for(int i1=0; i1<p.length; i1++) {
            int here = 1;
            String now = p[i1];
            if(now.length()>out.length()){
                out = now;
            }
            while(i1-here>=0&&i1+here<p.length){
                if(p[i1-here].equals(p[i1+here])){
                    now  = p[i1-here] + now + p[i1+here];
                    if(now.length()>out.length()){
                        out = now;
                    }
                    here++;
                }else{
                    break;
                }
            }
        }
        //情况2：核心是俩
        for(int i1=0; i1<p.length-1; i1++) {
            if(p[i1].equals(p[i1+1])){
                int here = 1;
                String now = p[i1]+p[i1+1];
                if(now.length()>out.length()){
                    out = now;
                }
                while(i1-here>=0&&i1+1+here<p.length){
                    if(p[i1-here].equals(p[i1+1+here])){
                        now  = p[i1-here] + now + p[i1+1+here];
                        if(now.length()>out.length()){
                            out = now;
                        }
                        here++;
                    }else{
                        break;
                    }
                }
            }
        }
        return out;
    }
}