class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len=nums1.length+nums2.length;
        double median;
     int[] res=new int[len];
    for(int i=0;i<nums1.length;i++){
        res[i]=nums1[i];
    }
    for(int i=0;i<nums2.length;i++){
        res[nums1.length+i]=nums2[i];
    }  
    Arrays.sort(res);
    for(int i=0;i<len;i++){
        if(len%2==0){
            return (res[len/2]+res[(len/2)-1])/2.0;
        }
        else{
            return res[len/2];
        }
    } 
    return -1;
    }
}