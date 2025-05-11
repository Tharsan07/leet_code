class Solution {
    public int missingNumber(int[] nums) {
      for(int i=0;i<=nums.length;i++){
        int cnt=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==i){ 
              cnt++;
              break;
            }
        }
        if(cnt==0){
            return i;
        }
       
      }
      return -1;
    }
}