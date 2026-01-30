class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[] result=new int[m+n];
        int i=0,j=0,k=0;
        while(i<n && j<m)
        {
            if(nums1[i]<nums2[j])
            {
                result[k++]=nums1[i++];
            }
            else
            {
                result[k++]=nums2[j++];

            }

        }
        if(i!=n)
        {
            for(int l=i;l<n;l++)
            {
                result[k++]=nums1[l];
            }
        }
        else
        {
            for(int l=j;l<m;l++)
            {
                result[k++]=nums2[l];
            }
        }
        double res;
        if(k%2==0)
        {
            res=(double)(result[(k/2)-1]+result[k/2])/2;
            return res;
        }
        else
        {
            res=result[k/2];
            return res;
        }
    }
}