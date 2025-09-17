class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        // int cnt=0;
         int occur=n/2;
        // for(int i=0;i<n;i++){
        //     cnt=0;
        //     for(int j=0;j<n;j++){
        //         if(nums[i]==nums[j]){
        //             cnt++;
        //         }
        //     }
        //     if(cnt>occur){
        //         return nums[i];
        //     }
        // }
        // return -1;
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
         for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > occur) {
                return entry.getKey();
            }
        }
       return -1;
    }
}