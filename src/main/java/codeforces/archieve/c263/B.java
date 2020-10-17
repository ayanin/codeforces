package codeforces.archieve.c263;

import java.util.Collections;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class B {
    public static void solve() {
        int[] nk = Scan.intArray();
        int[] a = IntStream.of(Scan.intArray()).boxed().sorted(Collections.reverseOrder()).mapToInt(i -> i).toArray();
        int n = nk[0];
        int k = nk[1];
        int x = a[0];
        int countIncluding = 0;
        String result = "-1";

        if (n < k) {
            System.out.println(result);
            return;
        }

        for (int i = 0; i < a.length; i++) {
            if (countIncluding == k - 1) {
                x = a[i];
                break;
            }

            countIncluding++;
        }

        System.out.println(x + " " + 0);
    }

    public static void main(String[] args) {
        solve();
        Scan.scanner.close();
    }

    static class Scan {
        static private Scanner scanner = new Scanner(System.in);

        public static String nextLine() {
            return scanner.nextLine();
        }

        public static int nextInt() {
            return scanner.nextInt();
        }

        public static long nextLong() {
            return scanner.nextLong();
        }

        public static int[][] numberMatrix(int size) {
            int[][] matrix = new int[size][size];

            for (int i = 0; i < size; i++) {
                int[] row = Stream.of(scanner.next().split(" ")).mapToInt(Integer::parseInt).toArray();
                matrix[i] = row;
            }

            return matrix;
        }

        public static int[] intArray() {
            return Stream.of(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
    }
}
