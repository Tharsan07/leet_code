class Solution {
    public int findPeakElement(int[] nums) {
        int curr=Integer.MIN_VALUE;
        int max=Integer.MIN_VALUE;
        int ind=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>curr){
                curr=nums[i];
                if(curr>max){
                    max=curr;
                    ind=i;
                }
            }
        }
        return ind;
    }
}