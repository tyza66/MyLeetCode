int reverse(int x){
    int y = x;
    int fu = 1;
    int wei = 0,xin=1,wei1=1;
    int out = 0;
    int i,a,ling;
    if(x<=-2147483648||x>2147483647) return 0;
    if(y<0) 
    {
        fu = -1;
        y = -y;
        x = -x;
    }
    if(y==0) wei++;
    while(y!=0)
    {
        wei++;
        y = y/10;
    }
    for(;wei>0;wei--)
    {
        wei1 = 1;
        if(wei==10)
        {
            out += x/1000000000;
            wei--;
            xin *= 10;
        }
        for(i=1;i<=wei;i++)  wei1 *= 10; 
        a = x%wei1/(wei1/10);
        if(a>2&&xin==1000000000) return 0;
        out += a*xin;
        if((out>=147483647&&fu==1&&wei!=1)||(out>=147483648&&fu==-1&&wei!=1)) return 0;
        if(xin!=1000000000)xin *= 10;
    }
    if(fu==1)
    return out;
    else return -out;
}