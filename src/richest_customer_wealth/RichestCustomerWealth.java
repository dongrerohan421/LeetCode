package richest_customer_wealth;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = { { 1, 2, 3 }, { 3, 2, 1 } };
        maximumWealth(accounts); // output: 6
        int[][] accounts2 = { { 2, 8, 7 }, { 7, 1, 3 }, { 1, 9, 5 } };
        maximumWealth(accounts2); // output: 17
        int[][] accounts3 = { { 1, 5 }, { 7, 3 }, { 3, 5 } };
        maximumWealth(accounts3); // output: 10
    }

    private static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int wealth = 0;
            for (int j = 0; j < accounts[0].length; j++) {
                wealth += accounts[i][j];
                if (wealth > max) {
                    max = wealth;
                }
            }
        }
        return max;
    }
}
