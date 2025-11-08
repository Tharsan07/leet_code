class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ind1=0;
        int len=numbers.length;
        int ind2=0;
        for(int i=0;i<len;i++){
            int val=numbers[i];
            for(int j=i+1;j<len;j++){
                if(numbers[j]+val==target){
                    ind1=i;
                    ind2=j;
                   return new int[]{ind1+1,ind2+1}; 
                }
            }
            
        }
        return new int[]{-1,-1};
    }
}