package Array_and_String.TwoDArray;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @see <a href="https://leetcode.com/problems/diagonal-traverse/">Leetcode problem</a>
 */
public class DiagonalTraverse {

    /**
     * Time Complexity: <b>O(N * M), considering the array has NNN rows and MMM columns.</b>
     * <p>
     * Space Complexity: <b>O(min(N,M))</b>.
     */
    public int[] findDiagonalOrderIterationAndReverse(int[][] mat) {

        if (mat == null || mat.length == 0) {
            return new int[0];
        }

        // Variables to track the size of matrix
        int N = mat.length;
        int M = mat[0].length;

        int[] result = new int[N * M];
        // result iterator
        int k = 0;
        ArrayList<Integer> tempDiag = new ArrayList<>();

        for (int i = 0; i < N + M - 1; i++) {

            // Clear temp diagonal array
            tempDiag.clear();

            // Calculate index of initial element
            int r = i < M ? 0 : i - M + 1;
            int c = i < M ? i : M - 1;

            // Add diagonal elements util one of indexes goes out of scope
            while (c >= 0 && r < N) {
                tempDiag.add(mat[r++][c--]);
            }

            // reverse even numbered diagonal
            if (i % 2 == 0) Collections.reverse(tempDiag);

            // Add temp array to result array
            for (Integer el : tempDiag) {
                result[k++] = el;
            }
        }
        return result;
    }

    /**
     * Time Complexity: <b>O(N * M), considering the array has NNN rows and MMM columns.</b>
     * <p>
     * Space Complexity: <b>O(1)</b>.
     */
    public int[] findDiagonalOrderSimulation(int[][] matrix) {

        if (matrix == null || matrix.length == 0) {
            return new int[0];
        }

        int N = matrix.length;
        int M = matrix[0].length;

        int row = 0, column = 0;

        // The variable that helps us keep track of what direction of current diagonal
        int direction = 1;

        // The final result array
        int[] result = new int[N*M];
        int r = 0;

        while (row < N && column < M) {

            // Add the current element to the result matrix.
            result[r++] = matrix[row][column];

            // Move along in the current diagonal depending upon the current direction.
            int new_row = row + (direction == 1 ? -1 : 1);
            int new_column = column + (direction == 1 ? 1 : -1);

            // Checking if the next element in the diagonal is within the
            // bounds of the matrix or not. If it's not within the bounds,
            // we have to find the next head.
            if (new_row < 0 || new_row == N || new_column < 0 || new_column == M) {

                // If upwards
                if (direction == 1) {

                    // For an upwards going diagonal having [i, j] as its tail
                    // If [i, j + 1] is within bounds, then it becomes
                    // the next head. Otherwise, the element directly below
                    // i.e. the element [i + 1, j] becomes the next head
                    row += (column == M - 1 ? 1 : 0) ;
                    column += (column < M - 1 ? 1 : 0);

                } else {

                    // For a downwards going diagonal having [i, j] as its tail
                    // if [i + 1, j] is within bounds, then it becomes
                    // the next head. Otherwise, the element directly below
                    // i.e. the element [i, j + 1] becomes the next head
                    column += (row == N - 1 ? 1 : 0);
                    row += (row < N - 1 ? 1 : 0);
                }

                // Flip the direction
                direction = 1 - direction;

            } else {
                row = new_row;
                column = new_column;
            }
        }
        return result;
    }

}
