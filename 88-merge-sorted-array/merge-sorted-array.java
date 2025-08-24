class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        // for(int i=0;i<m+n;i++){
        //     for(int j=n;j<n;j++){
        //         nums1[j]=nums2[i];
        //     }
        // }
        Arrays.sort(nums1);
    }
}
