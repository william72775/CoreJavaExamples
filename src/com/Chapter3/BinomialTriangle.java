package com.Chapter3;
import java.util.Arrays;


public class BinomialTriangle {
    public int[][] printBinomialTriangle(int N) {
        int[][] triangle = new int[N][];

        // 初始状态
        int[] initArray = {1};
        triangle[0] = initArray;
        System.out.println(Arrays.toString(initArray).substring(1,initArray.length + 1));

        // 迭代并存储每一个维度的数组
        for (int i = 2; i <= N; i++) {
            int[] a = new int[i];

            int[] prev = triangle[i-2];
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) {
                    a[j] = 1;
                } else {
                    a[j] = prev[j-1] + prev[j];
                }

                // 实时打印输出
                System.out.print(a[j] + " ");

            }

            triangle[i-1] = a;
            System.out.print("\n");

        }
        return triangle;
    }

    public static void main(String[] args) {
        BinomialTriangle bt = new BinomialTriangle();
        int[][] res = bt.printBinomialTriangle(10);
    }
}
