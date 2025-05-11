class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            int num=map.getOrDefault(nums[i],0);
            map.put(nums[i],num+1);
        }
        for(Integer it:map.keySet()){
            if(map.get(it)==1){
                return it;
            }
        }
return -1;
    }
}