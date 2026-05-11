class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int c = m + n;
        int[] nums3 = new int[c];
        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                nums3[k] = nums1[i];
                i++;
                k++;
            } else {
                nums3[k] = nums2[j];
                j++;
                k++;
            }
        }

        while (i < m) {
            nums3[k] = nums1[i];
            i++;
            k++;
        }

        while (j < n) {
            nums3[k] = nums2[j];
            j++;
            k++;
        }

        for (int x=0;x<c;x++) {
            nums1[x] = nums3[x];
        }
    }
}
