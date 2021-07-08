/*
* 0/1 knapsack, each item must be either chosen or left behind
* */
package main.java.dp;

import java.util.ArrayList;
import java.util.Collections;

public class Knapsack {
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
                else DP[i][sz] = Math.max(DP[i - 1][sz], v + DP[i - 1][sz - w]);
            }
        }

        int size = c;
        ArrayList<Integer> sel = new ArrayList<>();

        for (int i = n; i > 0; i--) {
            if (DP[i][size] != DP[i - 1][size]) {
                sel.add(i - 1);
                size -= W[i - 1];
            }
        }

        Collections.reverse(sel);

        // 0, 0, 0, 0, 0
        // 0, 1500, 1500, 1500, 1500
        // 0, 1500, 1500, 1500, 3000
        // 0, 1500, 1500, 2000, 3500
        System.out.println(DP[n][c]);

        System.out.println(sel);
    }
}
