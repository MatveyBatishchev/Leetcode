package Array101.in_place;

/**
 * Time Complexity: <b>O(n)</b>
 * <p>
 * Space Complexity: <b>O(1)</b>.
 * @see <a href="https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/">Leetcode problem</a>
 */
public class ReplaceElementsWithGreatestRight {
    public int[] replaceElements(int[] arr) {
        int currentMax = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = currentMax;
            if (currentMax < temp) currentMax = temp;
        }
        arr[arr.length-1] = -1;
        return arr;
    }
}
