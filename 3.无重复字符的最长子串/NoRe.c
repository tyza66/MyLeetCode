int lengthOfLongestSubstring(char * s){
    int i = 0,j = 0,k = 0,f = 0,g = 0,h = 1,i1 = 1;
    char t;
    while(s[0]!='\0')
    {
        j = 1;
        t = s[0];
        for(i=1;s[i]!='\0';i++)
        {
            if(s[i]!=t)
            {
                j++;
            }
            else
            { 
                break;
            }
        }
                h = 1;
                for(f=0;f<j;f++)
                {
                    for(g=f+1;g<j;g++)
                    {
                        if(s[f]==s[g]) h = 0;
                    }
                }
                while(h==0&&j>=0){
                    j--;
                    i1 = 1;
                    for(f=0;f<j;f++)
                {
                    for(g=f+1;g<j;g++)
                    {
                        if(s[f]==s[g]) i1 = 0;
                    }
                }
                    if(i1==1) h = 1;
                }
                if(j>k&&h==1) k = j;
        s++;
    }
    return k;
}