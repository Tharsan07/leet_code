class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] occurance = new int[101];
        int[] result = new int[2];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            occurance[num]++;
        }

        for (int i = 0; i < occurance.length; i++) {
            if (occurance[i] == 2) {
                result[index++] = i;
            }
        }

        return result;
    }
}
