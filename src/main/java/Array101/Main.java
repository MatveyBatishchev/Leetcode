package Array101;


import Array101.introduction.SquaresOfSortedArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SquaresOfSortedArray squaresOfSortedArray = new SquaresOfSortedArray();
        System.out.println(Arrays.toString(squaresOfSortedArray.sortedSquares(new int[]{-7,-3,2,3,11})));
    }
}
