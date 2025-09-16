class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int len=0;
        boolean odd=false;

        for(int val:map.values()){
            len+=(val/2)*2;
            //used fore getting the even occurance
                if(val%2==1){
                    odd=true;
                }
        }
        if(odd){
            len+=1;
        }
        return len;
    }
}