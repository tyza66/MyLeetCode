class Solution {
    public static int myAtoi(String s) {
        s = s.trim();
        s = s + "a";
        char[] mys = s.toCharArray();
        int i = 0; boolean fu = false;
        if(mys[0]=='-') {i = 1; fu=true;}
        if(mys[0]=='+') {i = 1;}
        while(mys[i]=='0') i++;
        s = s.substring(i);  
        mys = s.toCharArray();
        i = 0;
        while(	(i<=10)&&(i<mys.length)&&
        		(mys[i]=='0'||
        		mys[i]=='1'||
        		mys[i]=='2'||
        		mys[i]=='3'||
        		mys[i]=='4'||
        		mys[i]=='5'||
        		mys[i]=='6'||
        		mys[i]=='7'||
        		mys[i]=='8'||
        		mys[i]=='9')) {
        	i++;
        }
        int end = 0;
        s = s.substring(0,i);
        try {
        	if(i!=0) end = Integer.parseInt(s);
        }catch(Exception e) {
        	if(!fu)	end = 2147483647;
        	else end = -2147483648;
        	fu = false;
        }
        if(fu) end = -end;
        return end;
    }
}