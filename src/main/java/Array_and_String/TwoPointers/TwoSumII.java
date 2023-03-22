package Array_and_String.TwoPointers;

public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int first = 0;
        int last = numbers.length - 1;
        while (first < last) {
            int sum = numbers[first] + numbers[last];
            if (sum == target) {
                return new int[]{++first, ++last};
            }
            if (sum > target) {
                last--;
            } else {
                first++;
            }
        }
        return new int[0];
    }
}
