package Array101;

/**
 * Time and space complexity
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
