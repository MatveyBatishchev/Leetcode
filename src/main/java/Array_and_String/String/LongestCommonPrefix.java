package Array_and_String.String;

// TODO: return to see other solutions: binary search and divide and conquer
/**
 * @see <a href="https://leetcode.com/problems/longest-common-prefix/">Leetcode problem</a>
 */
public class LongestCommonPrefix {

    /**
     * Time Complexity: <b>O(S)</b> , where S is the sum of all characters in all strings.
     * <p>
     * Space Complexity: <b>O(1)</b>.
     */
    public String longestCommonPrefixHorizontalScanning(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }

        return prefix;
    }

    /**
     * It is in the best and average cases has better time than horizontal scanning
     * Time Complexity: <b>O(S)</b> , where S is the sum of all characters in all strings.
     * <p>
     * Space Complexity: <b>O(1)</b>.
     */
    public String longestCommonPrefixVerticalScanning(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        char c;

        for (int i = 0; i < strs[0].length(); i++) {
            c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c)
                    strs[0] = strs[0].substring(0, i);
            }
        }

        return strs[0];
    }

}
