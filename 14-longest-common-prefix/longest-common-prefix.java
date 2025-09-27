class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res="";
        int currInd=0;
        if(strs.length==1){
            return strs[0];
        }
        while(true){
            for(int i=0;i<strs.length-1;i++){
                if(strs[i].length()<=currInd ||currInd >=strs[i+1].length()||strs[i].charAt(currInd)!=strs[i+1].charAt(currInd)){
                    return res;
                }
            }
            res+=strs[0].charAt(currInd);
            currInd+=1;
        }
      
    }
}