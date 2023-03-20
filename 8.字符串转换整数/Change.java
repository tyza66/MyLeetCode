class Solution {
    public int myAtoi(String s) {
        String s1 = s.strip();
        if(s1.equals("")) return 0;
        char sub = '+';
        if(s1.charAt(0)=='-'){
            sub = '-'; 
            s1 = s1.substring(1);
        }else if(s1.charAt(0)=='+'){
            sub = '+'; 
            s1 = s1.substring(1);
        }
        
        if(s1.equals("")||!(s1.charAt(0)>=48&&s1.charAt(0)<=57)){
            return 0;
        }
        String temp="";
        for(char a:s1.toCharArray()){       
            try {
                Integer.parseInt(temp+a);
            }catch(Exception e){
                if(a>=48&&a<=57){
                    if(sub=='-') return -2147483648;
                    return 2147483647;
                }else{
                    if(sub=='-') return -Integer.parseInt(temp);
                    return Integer.parseInt(temp);
                }
            }
            temp = temp + a;
        }
        if(sub=='-') return -Integer.parseInt(temp);
        return Integer.parseInt(temp);
    }
}