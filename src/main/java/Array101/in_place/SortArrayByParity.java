package Array101.in_place;

/**
 * Time Complexity: <b>O(n)</b>
 * <p>
 * Space Complexity: <b>O(1)</b>.
 * @see <a href="https://leetcode.com/problems/sort-array-by-parity/">Leetcode problem</a>
 */
public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int last = nums.length - 1;
        int i = 0;
        while (i <  last) {
            if (nums[i] % 2 != 0) {
                if (nums[last] % 2 == 0) {
                    int temp = nums[i];
                    nums[i] = nums[last];
                    nums[last--] = temp;
                }
                else {
                    last--;
                    continue;
                }
            }
            i++;
        }
        return nums;
    }
}
