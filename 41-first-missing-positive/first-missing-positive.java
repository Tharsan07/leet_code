class Solution {
    public int firstMissingPositive(int[] nums) {
         int[] arr = Arrays.stream(nums).filter(n -> n > 0).toArray();
         Arrays.sort(arr);
         int num=1;
         for(int i:arr){
            if(i==num){
                num++;
            }
            else if(i>num){
                return num;
            }
         }
         return num;
    }
}