package Array_and_String.Conclusion;

public class RotateArray {

    private void reverse(int[] nums, int first, int last) {
        int temp;
        for (; first < last; first++, last--) {
            temp = nums[first];
            nums[first] = nums[last];
            nums[last] = temp;
        }
    }

    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 1) return;
        int N = nums.length;
        k = k % N;
        reverse(nums,0, N - k - 1);
        reverse(nums,N - k, N-1);
        reverse(nums,0,N-1);
    }
}
