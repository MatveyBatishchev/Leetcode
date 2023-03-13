package Array_and_String.String;


/**
 * Time Complexity: <b>O(max(L1, L2))</b>, where L1 and L2 are the lengths of strings a and b respectively
 * <p>
 * Space Complexity: <b>O(max(L1, L2))</b>.
 * @see <a href="https://leetcode.com/problems/add-binary/">Leetcode problem</a>
 */
public class AddBinary {
    public String addBinary(String a, String b) {
        // Indexes of last elements of both strings
        int i = a.length() - 1;
        int j = b.length() - 1;

        int carry = 0;
        int sum = 0;

        StringBuilder result = new StringBuilder();

        while (i >= 0 || j >= 0 || carry == 1) {
            sum = carry;
            if (i >= 0) sum += a.charAt(i) - '0';
            if (j >= 0) sum += b.charAt(j) - '0';
            carry = sum/2;
            result.append((char) (sum % 2 + '0'));
            i--;
            j--;
        }
        return result.reverse().toString();
    }
}
