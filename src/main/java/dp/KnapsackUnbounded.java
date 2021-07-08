/*
* unbounded knapsack
* */
package main.java.dp;

public class KnapsackUnbounded {
    public static void main(String[] args) {
        int c = 4; // knapsack capacity
        int n = 3;
        int[] V = {1500, 3000, 2000};
        int[] W = {1, 4, 3};

        int[][] DP = new int[n + 1][c + 1];

        for (int i = 1; i <= n; i++) {
            int w = W[i - 1], v = V[i - 1];

            for (int sz = 1; sz <=c; sz++) {
                if (w > sz) DP[i][sz] = DP[i - 1][sz];
                else DP[i][sz] = Math.max(DP[i - 1][sz], v + DP[i][sz - w]);
            }
        }

        // 0, 0, 0, 0, 0
        // 0, 1500, 3000, 4500, 6000
        // 0, 1500, 3000, 4500, 6000
        // 0, 1500, 3000, 4500, 6000
        System.out.println(DP[n][c]);
    }
}
