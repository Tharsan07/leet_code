class Solution {
    public boolean isHappy(int n) {
       
        int num=0;
        while(n != 1 && n != 4){
             int sum=0;
            while(n>0){
                num=n%10;
                sum+=(num*num);
                n=n/10;
            }
            n=sum;
        }
        return n==1;
    }
}