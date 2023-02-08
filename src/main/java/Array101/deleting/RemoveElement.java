package Array101.deleting;

/**
 * Time Complexity: <b>O(n)</b>
 * <p>
 * Space Complexity: <b>O(1)</b>.
 * @see <a href="https://leetcode.com/problems/remove-element/">Leetcode problem</a>
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int last = nums.length;
        while (i < last) {
            if (nums[i] == val) {
                nums[i] = nums[last-1];
                last--;
            } else {
                i++;
            }
        }
        return last;
    }
}
