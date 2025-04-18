class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int start=0;
        int end=n-1;
        int ind=0;
       while(start<=end){
        int mid = start + (end - start) / 2;
        if(nums[mid]==target){
           return mid;
        }
        else if(target>nums[mid]){
            start=mid+1;
        }
        else{
            end=mid-1;
        }
       }
       return -1;
    }
}