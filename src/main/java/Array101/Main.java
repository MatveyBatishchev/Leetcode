package Array101;

import Array101.practice.ThirdMaximumNumber;

public class Main {
    public static void main(String[] args) {
        ThirdMaximumNumber thirdMaximumNumber = new ThirdMaximumNumber();
        System.out.println(thirdMaximumNumber.thirdMaxThreePointers(new int[]{2,2,3,1}));
    }

    public static int[] randomArray() {
        int[] nums = new int[100000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 1000);
        }
        return nums;
    }
}
