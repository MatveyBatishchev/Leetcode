package Array101.inserting;

/**
 * Time Complexity: <b>O(N)</b>, <br>where N is the number of elements in the array.
 * We do two passes through the array, one to find the number of possible_dups and the other to copy the elements.
 * In the worst case we might be iterating the entire array, when there are less or no zeros in the array.
 * <p>
 * Space Complexity: <b>O(1)</b>.
 * @see <a href="https://leetcode.com/problems/duplicate-zeros/">Leetcode problem</a>
 */
public class DuplicateZeroes {
    public void duplicateZeros(int[] arr) {
        int count = 0;
        int length = arr.length - 1;
        for (int i = 0; i <= length - count; i++) {
            if (arr[i] == 0) {
                if (i == length - count) {
                    arr[length] = 0;
                    length--;
                    break;
                }
                count++;
            }
        }
        for (int copyFrom = length - count, copyTo = length; copyFrom >= 0; copyFrom--, copyTo--) {
            if (arr[copyFrom] == 0) {
                arr[copyTo--] = 0;
                arr[copyTo] = 0;
            } else {
                arr[copyTo] = arr[copyFrom];
            }
        }
    }
}
