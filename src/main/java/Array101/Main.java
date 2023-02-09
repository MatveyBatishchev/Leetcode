package Array101;

import Array101.in_place.SortArrayByParity;

public class Main {
    public static void main(String[] args) {

    }

    public static int[] randomArray() {
        int[] nums = new int[100000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 1000);
        }
        return nums;
    }
}
