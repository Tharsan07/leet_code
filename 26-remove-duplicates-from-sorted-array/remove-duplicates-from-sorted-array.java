class Solution {
    public int removeDuplicates(int[] nums) {
        int ind=0;
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[ind]!=nums[i]){
                    nums[ind+1]=nums[i];
                    ind++;
            }
        }
      return ind+1;
    }
}