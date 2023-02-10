package Array101.practice;

import java.util.Arrays;

public class ThirdMaximumNumber {

    /**
     * Time Complexity: <b>O(n)</b>
     * <p>
     * Space Complexity: <b>O(1)</b>.
     **/
    public int thirdMaxThreePointers(int[] nums) {
        long firstMax = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;

        for (int num : nums) {
            if (num == firstMax || num == secondMax || num == thirdMax) continue;

            if (num >= firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
            } else if (num >= secondMax) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (num >= thirdMax) {
                thirdMax = num;
            }
        }

        if (thirdMax == Long.MIN_VALUE) return (int) firstMax;
        return (int) thirdMax;
    }

    /**
     * Time Complexity: <b>O(n * logn)</b>
     * <p>
     * Space Complexity: <b>O(1)</b>.
     **/
    public int thirdMaxSorting(int[] nums) {
        Arrays.sort(nums);

        int count = 1;
        int thirdMax = nums[nums.length-1];

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] != thirdMax) {
                thirdMax = nums[i];
                count++;
            }
            if (count == 3) return thirdMax;
        }
        return nums[nums.length-1];
    }
}
