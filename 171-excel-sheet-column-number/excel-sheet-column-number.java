class Solution {
    public int titleToNumber(String columnTitle) {
        int len=columnTitle.length();
        int ans=0;
        for(int i=0;i<len;i++){
            ans=ans*26+(columnTitle.charAt(i)-'A'+1);
        }
        return ans;
    }
}