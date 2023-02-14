package Array_and_String.introduction;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0 ; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
                if (i == 0) {
                    int[] expandedDigits = new int[digits.length + 1];
                    expandedDigits[0] = 1;
                    return expandedDigits;
                }
            } else {
                digits[i] += 1;
                break;
            }
        }
        return digits;
    }
}
