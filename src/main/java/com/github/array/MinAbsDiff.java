package main.java.com.github.array;

import java.util.Arrays;
import java.util.Scanner;

public class MinAbsDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter arr length ");
        int n = sc.nextInt();
        int[] a = new int[n];
//        int [] a = {4, 5, 2, 2, 7, 10};
//        int n = a.length;

        System.out.println("enter values");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("enter queries arr length");
        int m = sc.nextInt();
        int[][] queries = new int[m][2];

//        int[][] queries = {{2, 3}, {0, 2}, {0 , 5}, {3, 5}};
//        int m = queries.length;

        System.out.println("enter values");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 2; j++) {
                queries[i][j] = sc.nextInt();
            }
        }

//        int[] r = new int[m];

//        for (int i = 0; i < m; i++) {
//            int from = queries[i][0]; // start index
//            int to = queries[i][1]; // end index
//            int min = Integer.MAX_VALUE;
//            for (int j = from; j <= to; j++) {
//                for (int k = j + 1; k <= to && a[j] != a[k]; k++) {
//                    int diff = Math.abs(a[j] - a[k]);
//                    if (min > diff) min = diff;
//                }
//            }
//            if (min == Integer.MAX_VALUE) r[i] = -1;
//            else r[i] = min;
//        }

        int max = Arrays.stream(a).max().getAsInt();
        int[][] count = new int[n][max + 1]; // cumulative frequencies
        int[] r = new int[m];

        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < max + 1; j++) {
                if (i > 0) count[i][j] = count[i - 1][j]; // copy previous row
            }
            ++count[i][a[i]];
        }

        for (int i = 0; i < m; i++) {
            int from = queries[i][0]; // start index
            int to = queries[i][1]; // end index
            int min = Integer.MAX_VALUE;
            int prev = -1;

            for (int j = 0 ; j < max + 1; j++) {
                if ((count[to][j] - (from > 0 ? count[from - 1][j] : 0)) > 0) {
                    if (prev != -1) min = Math.min(min, j - prev);
                    prev = j;
                }
            }

            if (min == Integer.MAX_VALUE) r[i] = -1;
            else r[i] = min;
        }

        System.out.println("result " + Arrays.toString(r));
    }
}
