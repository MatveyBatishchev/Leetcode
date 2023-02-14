package Array_and_String.introduction;

/**
 * Time Complexity: <b>O(n)</b>
 * <p>
 * Space Complexity: <b>O(1)</b>.
 * @see <a href="https://leetcode.com/problems/largest-number-at-least-twice-of-others/">Leetcode problem</a>
 */
public class LargestNumberAtLeastTwiceOfOthers {
    public int dominantIndex(int[] nums) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int maxIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == firstMax || nums[i] == secondMax) continue;
            if (nums[i] >= firstMax) {
                secondMax = firstMax;
                firstMax = nums[i];
                maxIndex = i;
            } else if (nums[i] >= secondMax) {
                secondMax = nums[i];
            }
        }
        if (secondMax * 2 <= firstMax) return maxIndex;
        return -1;
    }
}
