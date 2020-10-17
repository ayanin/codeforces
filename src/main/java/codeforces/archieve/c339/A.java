package codeforces.archieve.c339;

import java.util.Scanner;
import java.util.stream.Stream;

/*
input:
3+2+1
output:
1+2+3

input:
1+1+3+1+3
output:
1+1+1+3+3
*/

public class A {
    public static void solve() {
        String expr = Scan.nextLine();
        int[] nums = Stream.of(expr.split("\\+")).mapToInt(Integer::parseInt).sorted().toArray();
        String result = "";

        for (int i = 0; i < nums.length; i++) {
            result += nums[i] + (i == nums.length - 1 ? "" : "+");
        }

        System.out.println(result);
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
            return Stream.of(scanner.next().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
    }
}
