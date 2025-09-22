class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n=nums.length;
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int max=0;
        int res=0;
       
        for (int val : map.values()) {
            max = Math.max(max, val);
        }
          for (int val : map.values()) {
            if (val == max) {
                res += val;
            }
        }
        return res;
    }
}