package Array101.searching;

import java.util.HashSet;
import java.util.Set;

/**
 * @see <a href="https://leetcode.com/problems/check-if-n-and-its-double-exist/">Leetcode problem</a>
 */
public class CheckIfNAndItsDoubleExist {

    /**
     * Time Complexity: <b>O(n * logn)</b>, set.contains() costs O(logn) at worst case
     * <p>
     * Space Complexity: <b>O(n)</b>.
     **/
    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            if (set.contains(i * 2) || (i % 2 == 0 && set.contains(i / 2))) return true;
            set.add(i);
        }
        return false;
    }

    /**
     * Time Complexity: <b>O(n^2)</b>
     * <p>
     * Space Complexity: <b>O(1)</b>.
     **/
    public boolean checkIfExistBrute(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && (arr[i] == arr[j] * 2) || (arr[i] * 2 == arr[j])) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Time Complexity: <b>O(n^2)</b>
     * <p>
     * Space Complexity: <b>O(1)</b>.
     **/
    public boolean checkIfExistGap(int[] arr) {
        long timeMark = System.currentTimeMillis();
        int gap = arr.length - 1;

        while (gap > 0) {
            for (int i = 0; i + gap < arr.length ; i++) {
                if (arr[i] == 2 * arr[i + gap] || 2 * arr[i] == arr[i + gap]) {
                    return true;
                }
            }
            gap--;
        }
        return false;
    }
}
