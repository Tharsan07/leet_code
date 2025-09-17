class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int cnt=0;
        int max=0;
        int occur=n/2;
        for(int i=0;i<n;i++){
            cnt=0;
            for(int j=0;j<n;j++){
                if(nums[i]==nums[j]){
                    cnt++;
                    if(cnt>max){
                        max=cnt;
                        if(max>occur){
                            return nums[i];
                        }
                    }
                }
            }
        }
        return -1;
    }
}