char * convert(char * s, int numRows){
    char map[1000][1000];
    int i = 0,j = 0,k = 0,f = 0;
    int i1,j1;
    int lie;
    char* out = s;
    if(strlen(s)==1||numRows==1) return s;
    for(i1=0;i1<numRows;i1++)
    {
        for(j1=0;j1<1000;j1++)
        {
            map[i1][j1] = '0';
        }
    }
    i=j=0;
    while(*s!='\0')
    {
        if(j%(numRows-1)==0&&(i<numRows))
        {
            if(i==0&&f==1) i++;
            map[i][j] = *(s++);
            i++;
        }
        else
        {
            if(i==numRows) {i--;lie = j+numRows-1;}
            i--;j++;
            map[i][j] = *(s++);
            if(f==0) f = 1;
        }
    }
    for(i1=0;i1<numRows;i1++)
    {
        for(j1=0;j1<=lie;j1++)
        {
            if(map[i1][j1]!='0') {out[k]=map[i1][j1];k++;}
        }
    }
    return out;
}