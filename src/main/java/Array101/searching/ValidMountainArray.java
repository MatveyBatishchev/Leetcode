package Array101.searching;

/**
 * Time Complexity: <b>O(n)</b>
 * <p>
 * Space Complexity: <b>O(1)</b>.
 * @see <a href="https://leetcode.com/problems/merge-sorted-array/">Leetcode problem</a>
 */
public class ValidMountainArray {

    public boolean validMountainArray(int[] arr) {
        if (arr == null || arr.length < 3) return false;
        int peakIndex = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] <= arr[i]) {
                peakIndex = i;
                break;
            }
        }
        if (peakIndex == 0) return false;

        for (int i = peakIndex; i < arr.length - 1; i++) {
            if (arr[i + 1] >= arr[i]) return false;
        }

        return true;
    }

}
