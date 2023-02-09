package Array101.in_place;

/**
 * Time Complexity: <b>O(n)</b>
 * <p>
 * Space Complexity: <b>O(1)</b>.
 * @see <a href="https://leetcode.com/problems/move-zeroes/">Leetcode problem</a>
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int lastEl = 0;

        for(int i = 0; i < nums.length; i++){
            if (nums[i] != 0) {
                nums[lastEl] = nums[i];
                lastEl++;
            }
        }

        for(int i = lastEl; i < nums.length; i++){
            nums[i] = 0;
        }
    }
}
