class Solution {
    public int[] advantageCount(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        int n = nums1.length;
        Integer[] index = new Integer[n];
        for (int i = 0; i < n; i++) {
            index[i] = i;
        }
        Arrays.sort(index, (a, b) -> nums2[b] - nums2[a]);
        int left = 0;
        int right = n - 1;
        int[] ans = new int[n];
        for (int i : index) {
            if (nums1[right] > nums2[i])
            ans[i] = nums1[right--];
            else
            ans[i] = nums1[left++];
        }
        return ans;
    }
}