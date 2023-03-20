class Solution {
    public int reverse(int x) {
        String now = String.valueOf(Math.abs(x));
        if(String.valueOf(x).charAt(0)=='-')
            try{
                return Integer.parseInt("-" + new StringBuilder(now).reverse().toString());
            }catch(Exception e){
                return 0;
            }    
        else
            try{
                return Integer.parseInt(new StringBuilder(now).reverse().toString());
            }catch(Exception e){
                return 0;
            }
    }
}