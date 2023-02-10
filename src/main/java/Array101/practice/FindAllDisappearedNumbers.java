package Array101.practice;

import java.util.*;

public class FindAllDisappearedNumbers {

    /**
     * In-place operating<p>
     * Time Complexity: <b>O(n)</b>
     * <p>
     * Space Complexity: <b>O(1)</b>.
     **/
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int num : nums) {
            int index = Math.abs(num);
            if (nums[index - 1] > 0) {
                nums[index - 1] *= -1;
            }
        }
        List<Integer> disappearedNum = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) disappearedNum.add(i+1);
        }
        return disappearedNum;
    }

    /**
     * Using set<p>
     * Time Complexity: <b>O(n)</b>
     * <p>
     * Space Complexity: <b>O(n)</b>.
     **/
    public List<Integer> findDisappearedNumbersSet(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int val : nums) {
            set.add(val);
        }
        ArrayList<Integer> disappearedNum = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                disappearedNum.add(i);
            }
        }
        return disappearedNum;
    }

    /**
     * Using bucket count<p>
     * Time Complexity: <b>O(n)</b>
     * <p>
     * Space Complexity: <b>O(n)</b>.
     **/
    public List<Integer> findDisappearedNumbersBucket(int[] nums) {
        List<Integer> disappearedNum = new ArrayList<>();
        int[] numFrequency = new int[nums.length + 1];
        for (int num : nums) {
            numFrequency[num]++;
        }
        for (int i = 1; i < numFrequency.length; i++) {
            if (numFrequency[i] == 0) disappearedNum.add(i);
        }
        return disappearedNum;
    }
}
