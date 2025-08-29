class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
      k=k%n;

      int[] res=new int[n];
      for(int i=0;i<n;i++){
        res[(i+k)%n]=nums[i];
      }
      for(int i=0;i<n;i++){
        nums[i]=res[i];
      }
        }
//     int n=nums.length;
//           k = k % n;

//  for(int r=0;r<k;r++){
//     int last=nums[n-1];
//     for(int i=n-1;i>0;i--){
//      nums[i]=nums[i-1];
//     }
//     nums[0]=last;
//  }
    
    

}
