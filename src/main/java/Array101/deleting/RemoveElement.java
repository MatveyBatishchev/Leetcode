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
        int lastEl = nums.length;
        while (i < lastEl) {
            if (nums[i] == val) {
                nums[i] = nums[lastEl-1];
                lastEl--;
                continue;
            }
            i++;
        }
        return lastEl; // example with nums = {1} and val = 1 works as algo will return 0, so 1 in array is ignored
    }
}
