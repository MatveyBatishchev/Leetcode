package Array101.introduction;

/**
 * Time Complexity: <b>O(N)</b>
 * <p>
 * Space Complexity: <b>O(1)</b>.
 * @see <a href="https://leetcode.com/problems/find-numbers-with-even-number-of-digits/">Leetcode problem</a>
 */
public class EvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            // Integer.toString(num).length() % 2 == 0
            if ((int) (Math.log10(num) + 1) % 2 == 0) count++;
        }
        return count;
    }
}
