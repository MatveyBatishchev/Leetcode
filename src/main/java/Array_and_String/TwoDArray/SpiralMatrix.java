package Array_and_String.TwoDArray;

import java.util.ArrayList;
import java.util.List;

/**
 * Time Complexity: <b>O(N * M)</b>
 * <p>
 * Space Complexity: <b>O(1)</b>.
 * @see <a href="https://leetcode.com/problems/spiral-matrix/">Leetcode problem</a>
 */
public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {

        if (matrix == null || matrix.length == 0)
            return new ArrayList<>();

        List<Integer> result = new ArrayList<>();

        int top = 0, bottom = matrix.length - 1, left = 0, right = matrix[0].length - 1;

        while (right >= left && bottom >= top) {
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }

            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }

            if (top != bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
            }

            if (left != right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
            }
            top++;
            right--;
            left++;
            bottom--;
        }

        return result;
    }
}
