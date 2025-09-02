class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26]; // store frequency of each letter in magazine

        // Step 1: Count letters in magazine
        for (char c : magazine.toCharArray()) {
            count[c - 'a']++;
        }

        // Step 2: Check ransomNote letters
        for (char c : ransomNote.toCharArray()) {
            if (count[c - 'a'] == 0) {
                return false; // not enough of this letter
            }
            count[c - 'a']--; // use one letter
        }

        return true; // all ransomNote letters found
    }
}
