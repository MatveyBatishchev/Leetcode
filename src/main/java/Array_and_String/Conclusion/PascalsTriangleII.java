package Array_and_String.Conclusion;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>(rowIndex + 1);
        for (int j = 0; j < rowIndex + 1; j++) {
            row.add(0);
        }
        for (int i = 0; i < rowIndex + 1; i++) {
            for (int j = i; j >= 0; j--) {
                if (j == 0 || j == i) row.set(j,1);
                else row.set(j,row.get(j) + row.get(j-1));
            }
        }
        return row;
    }

    // Best
    public List<Integer> getRowMath(int rowIndex) {
        List<Integer> row = new ArrayList<>(rowIndex + 1);
        long temp = 1;
        row.add(1);
        for (int i = 1, up = rowIndex, down = 1; i <= rowIndex; i++, up--, down++) {
            temp = temp * up / down;
            row.add((int)temp);
        }
        System.out.println(row);
        return row;
    }
    
}
