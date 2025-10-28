class Solution {
    public int fib(int n) {
        int a=0;
        int b=1;
        int ans=0;
        if(n<2)return n;
        for(int i=2;i<=n;i++){
             ans=a+b;
            a=b;
            b=ans;
        }
        return ans;
    }
}