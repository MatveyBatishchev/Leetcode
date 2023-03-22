package Array_and_String.TwoPointers;

import java.util.Arrays;

public class ReverseString {
    public void reverseString(char[] s) {

        int N = s.length - 1;

        for (int i = 0; i < s.length / 2; i++) {
            char tmp = s[i];
            s[i] = s[N - i];
            s[N - i] = tmp;
        }
        System.out.println(Arrays.toString(s));

//        int first = 0;
//        int last = s.length - 1;
//        while (first < last) {
//            char tmp = s[first];
//            s[first] = s[last];
//            s[last] = tmp;
//            first++;
//            last--;
//        }
//        System.out.println(Arrays.toString(s));
    }
}
