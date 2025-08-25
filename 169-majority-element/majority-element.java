class Solution {
    public int majorityElement(int[] nums) {
         int n=nums.length;
        int max=n/2;
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            int num=map.getOrDefault(nums[i],0);
            map.put(nums[i],num+1);
        }
        for(Map.Entry<Integer, Integer> it : map.entrySet()){
            if(it.getValue()>max){
                return it.getKey();
            }
        }
        return -1;
    
     }
}