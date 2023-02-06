package Array101.introduction;

/**
 * Time Complexity: <b>O(N)</b>
 * <p>
 * Space Complexity: <b>O(1)</b>.
 * @see <a href="https://leetcode.com/problems/squares-of-a-sorted-array/">Leetcode problem</a>
 */
public class SquaresOfSortedArray {
    public int[] sortedSquares(int[] nums) {
        int first = 0;
        int last = nums.length - 1;
        int[] result = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            if (Math.abs(nums[first]) > Math.abs(nums[last])) {
                result[i] = nums[first] * nums[first];
                first++;
            } else {
                result[i] = nums[last] * nums[last];
                last--;
            }
        }
        return result;
    }
}
