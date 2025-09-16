class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       
    //    StringBuilder sb=new StringBuilder(magazine);

    // char[] arr=ransomNote.toCharArray();
    //    for(int i=0;i<arr.length;i++){
    //     int ind=sb.indexOf(String.valueOf(arr[i]));
    //     if(ind==-1){
    //         return false;
    //     }
    //     sb.deleteCharAt(ind);
    //    }
    //    return true;
       
       int[] occur=new int[26];
       for(char c: magazine.toCharArray()){
        occur[c-'a']++;
       }
       for(char c:ransomNote.toCharArray()){
        if(occur[c-'a']==0){
            return false;
        }
        occur[c-'a']--;
       }
       return true;
       
       
       
       
       
       
       
        // int[] count = new int[26]; 
        // for (char c : magazine.toCharArray()) {
        //     count[c - 'a']++;
        // }   
        // for (char c : ransomNote.toCharArray()) {
        //     if (count[c - 'a'] == 0) {
        //         return false; 
        //     }
        //     count[c - 'a']--; 
        // }
        // return true; 
    }
}
