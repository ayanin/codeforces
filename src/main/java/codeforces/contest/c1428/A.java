package codeforces.contest.c1428;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// https://codeforces.com/contest/1428/problem/A

/*
input:
2
1 2 2 2
1 1 2 2
output:
1
4
*/

public class A {
    public static class Coord {
        public long x;
        public long y;

        public Coord(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void solve() {
        long t = FS.nextLong();

        ArrayList<Coord> diffs = new ArrayList<Coord>();

        for (int i = 0; i < t; i++) {
            long[] coords = FS.readArrayL(4);
            Coord start = new Coord(coords[0], coords[1]);

            Coord end = new Coord(coords[2], coords[3]);
            Coord diff = new Coord(end.x - start.x, end.y - start.y);
            diffs.add(diff);
        }

        for (int i = 0; i < diffs.size(); i++) {
            Coord diff = diffs.get(i);
            long steps = Math.abs(diff.x) + Math.abs(diff.y);

            // right and top or bottom
            if (diff.x > 0 && (diff.y > 0 || diff.y < 0)) {
                steps += 2;
            }

            // left and top or bottom
            if (diff.x < 0 && (diff.y > 0 || diff.y < 0)) {
                steps += 2;
            }

            FS.pt.println(steps);
        }
    }

    public static void main(String[] args) {
        solve();
        FS.pt.close();
    }

    static class FS {
        private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        private static StringTokenizer st = new StringTokenizer("");
        static PrintWriter pt = new PrintWriter(System.out);

        static String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        static int nextInt() {
            return Integer.parseInt(next());
        }

        static int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        static int[][] read2Array(int m, int n) {
            int[][] a = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = nextInt();
                }
            }
            return a;
        }

        static long[][] read2ArrayL(int m, int n) {
            long[][] a = new long[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = nextInt();
                }
            }
            return a;
        }

        void printArr(long[] arr) {
            for (long value : arr) {
                pt.print(value);
                pt.print(" ");
            }
            pt.println();
        }

        static long[] readArrayL(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        static void printArr(int[] arr) {
            for (int value : arr) {
                pt.print(value);
                pt.print(" ");
            }
            pt.println();
        }

        static void printArrL(int[] arr) {
            for (int value : arr) {
                pt.print(value);
                pt.print(" ");
            }
            pt.println();
        }

        static void print2Arr(int[][] arr, int m, int n) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    pt.print(arr[i][j]);
                    pt.print(" ");
                }
                pt.println();
            }
            pt.println();
        }

        static void print2Arr(long[][] arr, int m, int n) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    pt.print(arr[i][j]);
                    pt.print(" ");
                }
                pt.println();
            }
            pt.println();
        }

        static List<Integer> readListInt(int n) {
            List<Integer> list = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                list.add(nextInt());
            }
            return list;
        }

        static <T> void printList(List<T> list) {
            for (T value : list) {
                pt.print(value);
                pt.print(" ");
            }
            pt.println();
        }

        static void close() {
            pt.close();
        }

        static long nextLong() {
            return Long.parseLong(next());
        }
    }
}
