class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int n=energy.length;
       int[] ans=new int[n];
    
        int max=Integer.MIN_VALUE;
       for(int i=n-1;i>=0;i--){
        if(i+k<n){
            ans[i]=energy[i]+ans[i+k];
        }
        else{
            ans[i]=energy[i];
        }
        max=Math.max(max,ans[i]);
       }
        return max;
    }
}