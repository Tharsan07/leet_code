class Solution {
    public int majorityElement(int[] nums) {
        //  int n=nums.length;
        // int max=n/2;
        // Map<Integer,Integer>map=new HashMap<>();
        // for(int i=0;i<n;i++){
        //     int num=map.getOrDefault(nums[i],0);
        //     map.put(nums[i],num+1);
        // }
        // for(Map.Entry<Integer, Integer> it : map.entrySet()){
        //     if(it.getValue()>max){
        //         return it.getKey();
        //     }
        // }
        // return -1;

         int n=nums.length;
        int maxOcc= n/2;

        int cnt=0;
        int max=0;
        int val=0;
        for(int i=0;i<n;i++){
            int curr=nums[i];
            cnt=0;
            for(int j=0;j<n;j++){
                if(nums[j]==curr){
                    cnt++;
                    if(cnt>max){
                        max=cnt;
                        val=curr;
                        if(max>maxOcc){
                            // System.out.println(val);
                            return val;
                        }
                    }
                }
            }
        }
        return -1;
    
     }
}