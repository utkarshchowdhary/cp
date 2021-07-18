package main.java.classic;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] a = {-1, 2, 4, -3, 5, 2, -5, 2};
        int n = a.length;
        int best = Integer.MIN_VALUE;

//        for (int i = 0; i < n; i++) {
//            for (int j = i; j < n; j++) {
//                int sum = 0;
//                for (int k = i; k <= j; k++) {
//                    sum += a[k];
//                }
//                best = Math.max(best, sum);
//            }
//        }

//        for (int i = 0; i < n; i++) {
//            int sum = 0;
//            for (int j = i; j < n; j++) {
//                sum += a[j]; //  calculate the sum at the same time when the right end of the sub array moves
//                best = Math.max(best, sum);
//            }
//        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = Math.max(a[i], sum + a[i]); // calculate maximum sub array sum ending at current position
            best = Math.max(best, sum);
        }

        System.out.println(best);
    }
}
