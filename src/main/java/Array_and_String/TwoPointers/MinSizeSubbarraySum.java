package Array_and_String.TwoPointers;

public class MinSizeSubbarraySum {

    /**
     * Time Complexity: <b>O(n^2)</b>
     * <p>
     * Space Complexity: <b>O(n)</b>.
     */
    public int minSubArrayLen(int target, int[] nums) {
        int currentSum, result = Integer.MAX_VALUE;
        int[] sums = new int[nums.length];

        sums[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sums[i] = sums[i-1] + nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                currentSum = sums[j] - sums[i] + nums[i];
                if (currentSum >= target) {
                    result = Math.min(result, (j - i + 1));
                    break;
                }
            }
        }
        return result != Integer.MAX_VALUE ? result : 0;
    }

    /**
     * Time Complexity: <b>O(n^2)</b>
     * <p>
     * Space Complexity: <b>O(n)</b>.
     */
    public int minSubArrayLenTwoPointers(int target, int[] nums) {
        int N = nums.length;
        int result = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += nums[i];
            while (sum >= target) {
                result = Math.min(result, i + 1 - left);
                sum -= nums[left++];
            }
        }
        return (result != Integer.MAX_VALUE) ? result : 0;
    }

}
