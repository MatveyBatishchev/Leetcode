package Array_and_String.TwoDArray;

import java.util.ArrayList;
import java.util.List;


/**
 * Time Complexity: <b></b>
 * <p>
 * Space Complexity: <b>O(1)</b>.
 * @see <a href="https://leetcode.com/problems/pascals-triangle/">Leetcode problem</a>
 */
public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current,previous = null;

        for (int i = 0; i < numRows; i++) {
            current = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) current.add(1);
                else current.add(previous.get(j) + previous.get(j-1));
            }
            previous = current;
            result.add(current);
        }

        return result;
    }
}
