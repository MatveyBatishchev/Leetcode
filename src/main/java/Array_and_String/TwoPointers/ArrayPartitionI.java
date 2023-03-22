package Array_and_String.TwoPointers;

import java.util.Arrays;

public class ArrayPartitionI {
    public int arrayPairSumWithSort(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return  sum;
    }

    final static int K = 10000;

    public int arrayPairSumWithCountSort(int[] nums) {
        int[] count = new int[K * 2 + 1];
        for (int el : nums) {
            count[el + K]++;
        }

        int maxSum = 0;
        boolean isEvenIndex = true;
        for (int element = 0; element <= 2 * K; element++) {
            while(count[element] > 0) {
                // Add element if it is at even position
                maxSum += (isEvenIndex ? element - K : 0);
                // Flip the value (one to zero or zero to one)
                isEvenIndex = !isEvenIndex;
                // Decrement the frequency count
                count[element]--;
            }
        }
        return maxSum;
    }

}
