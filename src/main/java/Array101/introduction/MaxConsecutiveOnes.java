package Array101.introduction;

/**
 * Time Complexity: <b>O(N)</b>
 * <p>
 * Space Complexity: <b>O(1)</b>.
 * @see <a href="https://leetcode.com/problems/max-consecutive-ones">Leetcode problem</a>
 */
public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int countMax = 0;
        int count = 0;
        for (int num : nums) {
            if (num == 0) {
                if (count > countMax) countMax = count;
                count = 0;
            } else
                count++;
        }
        return Math.max(countMax, count);
    }
}
