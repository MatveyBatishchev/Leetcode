package Array_and_String;

import Array_and_String.introduction.PlusOne;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();
        System.out.println(Arrays.toString(plusOne.plusOne(new int[]{9,9,9})));
    }
}
