

double findMedianSortedArrays(int* nums1, int nums1Size, int* nums2, int nums2Size){
    int newSize = nums1Size + nums2Size;
    int i=0,j=0,k=0;
    int u[5000];
    while(i<nums1Size&&j<nums2Size)
    {
        if(nums1[i]>=nums2[j])
        {
            u[k] = nums2[j];
            k++;
            j++;
        }
        else
        {
            u[k] = nums1[i];
            k++;
            i++;
        }
        if(k>=newSize/2+1) break;
    }
    if(i==nums1Size)
    {
        while(k<newSize/2+1)
        {
            u[k] = nums2[j];
            k++;
            j++;
        }
    }
    if(j==nums2Size)
    {
        while(k<newSize/2+1)
        {
            u[k] = nums1[i];
            k++;
            i++;
        }
    }
    if(newSize%2==1)
    {
        return u[newSize/2];
    }
    else
    {
        return (u[newSize/2]+u[newSize/2-1])/2.0;
    }
}