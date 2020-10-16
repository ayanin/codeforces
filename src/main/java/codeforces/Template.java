package codeforces;

import java.util.Scanner;
import java.util.stream.Stream;

public class Template {
    public static void solve() {

    }

    public static void main(String[] args) {
        solve();
        Scan.scanner.close();
    }

    static class Scan {
        static private Scanner scanner = new Scanner(System.in);

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
