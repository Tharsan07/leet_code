class Solution {
    public int maximumProduct(int[] nums) {
        int max1=1;
        int max2=1;
        int ans=0;
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
          max1=nums[n-1]*nums[n-2]*nums[n-3];
          max2=nums[0]*nums[1]*nums[n-1];
        }
       
        return Math.max(max1,max2);
    }
}