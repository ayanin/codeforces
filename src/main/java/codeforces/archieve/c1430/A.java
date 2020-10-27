package codeforces.archieve.c1430;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class A {
    public static void solve() {
        int t = FS.nextInt();

        for (int i = 0; i < t; i++) {
            int n = FS.nextInt();
            int resultSum = 0;
            int[] rooms = { 0, 0, 0 };
            String result = "-1";

            if (n != 0 || n != 1 || n != 2 || n != 4) {
                for (int j = 0; j < 1000; j++) {
                    rooms[0] = j;
                    for (int k = 0; k < 1000; k++) {
                        rooms[1] = k;
                        for (int m = 0; m < 1000; m++) {
                            rooms[2] = m;
                            resultSum = 3 * rooms[0] + 5 * rooms[1] + 7 * rooms[2];

                            if (resultSum > n) {
                                rooms[2] = 0;
                                resultSum = 3 * rooms[0] + 5 * rooms[1] + 7 * rooms[2];
                                break;
                            }

                            if (resultSum == n) {
                                break;
                            }
                        }

                        if (resultSum > n) {
                            rooms[1] = 0;
                            resultSum = 3 * rooms[0] + 5 * rooms[1] + 7 * rooms[2];
                            break;
                        }

                        if (resultSum == n) {
                            break;
                        }
                    }

                    if (resultSum > n) {
                        rooms[0] = 0;
                        resultSum = 3 * rooms[0] + 5 * rooms[1] + 7 * rooms[2];
                        break;
                    }

                    if (resultSum == n) {
                        break;
                    }
                }
            }

            if (resultSum == n) {
                result = String.join(" ", Integer.toString(rooms[0]), Integer.toString(rooms[1]),
                        Integer.toString(rooms[2]));
            }

            FS.pt.println(result);
        }
    }

    public static void main(String[] args) {
        solve();
        FS.close();
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
            List<Integer> list = new ArrayList<Integer>(n);
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
