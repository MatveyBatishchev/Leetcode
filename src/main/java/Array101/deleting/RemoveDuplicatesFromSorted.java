package Array101.deleting;

/**
 * Time Complexity: <b>O(n)</b>
 * <p>
 * Space Complexity: <b>O(1)</b>.
 * @see <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/">Leetcode problem</a>
 */
public class RemoveDuplicatesFromSorted {
    public int removeDuplicates(int[] nums) {
        int lastEl = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[lastEl] != nums[i]) {
                if (++lastEl == i) continue;
                nums[lastEl] = nums[i];
            }
        }
        return lastEl + 1;
    }
}
