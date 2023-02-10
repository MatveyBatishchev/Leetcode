package Array101.practice;

import java.util.Arrays;

/**
 * @see <a href="https://leetcode.com/problems/height-checker/">Leetcode problem</a>
 */
public class HeightChecker {

    /**
     * Time Complexity: <b>O(n + k)</b>, uses bucket/counting sort where k is height range = 100
     * <p>
     * Space Complexity: <b>O(n + k)</b>.
     **/
    public int heightChecker(int[] heights) {
        int[] heightFrequency = new int[101]; // as 1 <= heights[i] <= 100
        for (int height : heights) {
            heightFrequency[height]++;
        }
        
        int result = 0;
        int currentHeight = 0;
        for (int i = 0; i < heights.length; i++) {
            while (heightFrequency[currentHeight] == 0) {
                currentHeight++;
            }
            if (currentHeight != heights[i]) result++;
            heightFrequency[currentHeight]--;
        }

        return result;
    }


    /**
     * Time Complexity: <b>O(n * logn)</b>, Arrays.sort is n*logn
     * <p>
     * Space Complexity: <b>O(n)</b>.
     **/
    public int heightCheckerSort(int[] heights) {
        int[] expected = Arrays.copyOf(heights, heights.length);
        Arrays.sort(expected);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (expected[i] != heights[i]) count++;
        }
        return count;
    }
}
