class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
    HashMap<Integer,Integer>map=new HashMap<>();
    for(int i=0;i<n;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
    }
    for(int num:map.keySet()){
        if(map.get(num)==1){
            return num;
        }
    }
    return 0;











// for(int i=0;i<n;i++){
//     int cnt=0;
//     for(int j=0;j<n;j++){
//         if(nums[i]==nums[j]){
//             cnt++;
//         }
//     }
//     if(cnt==1){
//         return nums[i];
//     }
// }
// return 0;
    }
}