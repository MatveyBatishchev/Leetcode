package Array101;

import Array101.deleting.RemoveDuplicatesFromSorted;
import Array101.deleting.RemoveElement;

public class Main {
    public static void main(String[] args) {
        RemoveDuplicatesFromSorted removeDuplicatesFromSorted = new RemoveDuplicatesFromSorted();
        System.out.println(removeDuplicatesFromSorted.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
}
