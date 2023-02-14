package Array_and_String.introduction;

/**
 * The pivot index is the index where the sum of all the numbers strictly to the left of the index is
 * equal to the sum of all the numbers strictly to the index's right.<p>
 * Time Complexity: <b>O(n)</b>
 * <p>
 * Space Complexity: <b>O(1)</b>.
 * @see <a href="https://leetcode.com/problems/find-pivot-index/">Leetcode problem</a>
 */
public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int[] sumLeft = new int[nums.length];
        int  currentSumLeft = 0;
        for (int i = 0; i < nums.length; i++) {
            sumLeft[i] =  currentSumLeft;
            currentSumLeft += nums[i];
        }
        int currentRightSum = 0;
        int pivotIndex = -1;
        for (int i = nums.length - 1; i >= 0 ; i--) {
            if (currentRightSum == sumLeft[i]) pivotIndex = i;
            currentRightSum += nums[i];
        }
        return pivotIndex;
    }

    public int pivotIndexLeetcodeApproach(int[] nums) {
        int sum = 0, leftsum = 0;
        for (int x: nums) sum += x;
        for (int i = 0; i < nums.length; ++i) {
            if (leftsum == sum - leftsum - nums[i]) return i;
            leftsum += nums[i];
        }
        return -1;
    }

}
