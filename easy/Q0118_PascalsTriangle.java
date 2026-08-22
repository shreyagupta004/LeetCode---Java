package easy;

import java.util.ArrayList;
import java.util.List;

public class Q0118_PascalsTriangle {
    public static void main(String args[]){
        Q0118_PascalsTriangle obj = new Q0118_PascalsTriangle();
        int numRows = 5;
        List<List<Integer>> result = obj.generate(numRows);
        System.out.println(result);
        
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {

            List<Integer> row = new ArrayList<>();

            row.add(1);

            if (i > 0) {
                List<Integer> prev = ans.get(i - 1);

                for (int j = 0; j < prev.size() - 1; j++) {
                    row.add(prev.get(j) + prev.get(j + 1));
                }

                row.add(1);
            }

            ans.add(row);
        }

        return ans;

    }

}
