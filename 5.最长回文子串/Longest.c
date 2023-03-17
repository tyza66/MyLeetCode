char * longestPalindrome(char * s){
    int end = strlen(s) - 1;
    int position = 0,zhenchangdu = -1,changdu;
    int i,j;
    int jige,weizhi;
    for(position=0;position<=end;position++)
    {
        i = position - 1;
        j = position + 1;
        changdu = 0;
        while(i>=0&&j<=end)
        {
            if(s[i]==s[j]) changdu++;
            else break;
            i--;j++;
        }
        if(changdu>zhenchangdu)
        {
            zhenchangdu = changdu;
            weizhi = position;
            jige = 1;
        }
        if(position<=end-1&&s[position]==s[position+1])
        {
            i = position - 1;
            j = position + 2;
            changdu = 0;
            while(i>=0&&j<=end)
            {
                if(s[i]==s[j]) changdu++;
                else break;
                i--;j++;
            }
            if(changdu>=zhenchangdu)
            {
                zhenchangdu = changdu;
                weizhi = position;
                jige = 2;
            }
        }
    }
    if(jige==1)
    {
        s[weizhi+zhenchangdu+1] = '\0';
    }
    else if(jige==2)
    {
        s[weizhi+zhenchangdu+2] = '\0';
    }
    return s+weizhi-zhenchangdu;
}