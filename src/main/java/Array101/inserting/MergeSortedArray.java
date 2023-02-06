package Array101.inserting;

import java.util.Arrays;

/**
 * Time Complexity: <b>O(m + n)</b>
 * <p>
 * Space Complexity: <b>O(1)</b>.
 * @see <a href="https://leetcode.com/problems/merge-sorted-array/">Leetcode problem</a>
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = nums1.length - 1, a = m - 1, b = n - 1; b >= 0; i--) {
            if (a >= 0 && nums1[a] > nums2[b]) {
                nums1[i] = nums1[a--];
            } else {
                nums1[i] = nums2[b--];
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
}
