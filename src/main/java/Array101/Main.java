package Array101;

import Array101.in_place.MoveZeroes;

public class Main {
    public static void main(String[] args) {
        MoveZeroes moveZeroes = new MoveZeroes();
        moveZeroes.moveZeroes(new int[]{0,1,0,3,12});
    }

    public static int[] randomArray() {
        int[] nums = new int[100000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 1000);
        }
        return nums;
    }
}
