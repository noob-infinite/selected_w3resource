package leetcode;

import java.util.Arrays;

public class L322_CoinChange_DP {
    public int coinChange(int[] coins, int amount) {
        
        return dp(coins, amount);   
    }
    private int dp(int[] coins, int amount) {
        int [] values = new int[amount+1];
        Arrays.fill(values, amount+1);
        values[0] = 0;
        for (int i = 0; i < amount + 1; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i - coins[j] >= 0) {
                    values[i] = Math.min(values[i-coins[j]]+1,values[i]);
                    // if (values[i-coins[j]] + 1 < values[i]) {
                    //     values[i] = values[i-coins[j]] + 1;
                    // }
                }
            }
        }
        if (values[amount] == amount+1)
            return -1;
        return values[amount];
    }
    public static void main(String[] args) {
        L322_CoinChange_DP sol = new L322_CoinChange_DP();
        System.out.println( sol.coinChange(new int[]{1,2,5}, 11) );
        System.out.println( sol.coinChange(new int[]{2}, 3) );
        System.out.println( sol.coinChange(new int[]{1}, 0) );
    }
}
