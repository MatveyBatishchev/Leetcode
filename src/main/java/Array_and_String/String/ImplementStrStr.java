package Array_and_String.String;

// TODO: Come back and try to implement hashing versions of this algorithm
/**
 * Time Complexity: <b>O(n*m)</b>, where L1 and L2 are the lengths of strings a and b respectively
 * <p>
 * Space Complexity: <b>O(1)</b>.
 * @see <a href="https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/">Leetcode problem</a>
 */
public class ImplementStrStr {

    public int strStr(String haystack, String needle) {

        int m = needle.length(), n = haystack.length();

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (needle.charAt(j) != haystack.charAt(i + j)) {
                    break;
                }
            }
            if (j == m) {
                return i;
            }
        }
        return -1;
    }
}
