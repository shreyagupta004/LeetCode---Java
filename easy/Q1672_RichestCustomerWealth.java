package easy;

public class Q1672_RichestCustomerWealth {
    public static void main(String[] args) {
         int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1}
        };

        Q1672_RichestCustomerWealth obj = new Q1672_RichestCustomerWealth();

        int answer = obj.maximumWealth(accounts);

        System.out.println(answer);

        
    }
     public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for (int i = 0; i < accounts.length; i++) {

            int sum = 0;

            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }

            if (sum > maxWealth) {
                maxWealth = sum;
            }
        }

        return maxWealth;
    }
        
    }


