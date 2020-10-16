package codeforces.archieve.c263;

import java.util.Scanner;
import java.util.stream.Stream;

/*
input:
0 0 0 0 0
0 0 0 0 1
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
output:
3

input:
0 0 0 0 0
0 0 0 0 0
0 1 0 0 0
0 0 0 0 0
0 0 0 0 0
output:
1
*/

// https://codeforces.com/problemset/problem/263/A

public class A {
    public static void solve() {
        int[][] matrix = Scan.numberMatrix(5);
        int[] positionOfOne = new int[2];
        int[] positionOfCenter = { 2, 2 };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    positionOfOne[0] = i;
                    positionOfOne[1] = j;
                }
            }
        }

        System.out.println(Math.abs((positionOfCenter[0] - positionOfOne[0]))
                + Math.abs((positionOfCenter[1] - positionOfOne[1])));
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
                int[] row = Stream.of(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                matrix[i] = row;
            }

            return matrix;
        }

        public static int[] intArray() {
            return Stream.of(scanner.next().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
    }
}
