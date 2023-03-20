/* 此解法超时
class Solution {
    public String convert(String s, int numRows) {
        String[][] out = new String[numRows][s.length()/numRows+numRows*(s.length()/numRows+numRows)];
        int i = 0,j = 0;
        String end = "";
        //0是直线向下模式
        //1是斜线向右上角走模式
        int mode = 0;
        for(String one:s.split("")){
            if(i<0||j<0) break;
            if(mode==0){
                out[i][j] = one;
                i++;
                if(i==numRows){
                    i = i - 2;
                    j++;
                    mode = 1;
                }
            }else if(mode==1){
                out[i][j] = one;
                i--;j++;
                if(i==0){
                    j++;
                    mode = 0;
                }
            }
        }
        for(String[] i1:out){
            for(String j1:i1){
                if(j1!=null){
                    end = end + j1;
                }
            }
        }
        return end;
    }
}
*/

class Solution {
    public String convert(String s, int numRows) {
        if(numRows<2) return s;
        String[] sm = new String[numRows];
        Arrays.fill(sm,"");
        int i=0,flag=-1;
        for(char c : s.toCharArray()){
            sm[i] = sm[i] + c;
             if(i == 0 || i == numRows -1) flag = - flag;
            i += flag;
            
        }
        String end = "";
        for(String as:sm){
                end = end + as;
        }
        return end;
    }
}