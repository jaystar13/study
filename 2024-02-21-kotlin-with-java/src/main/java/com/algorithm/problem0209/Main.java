package com.algorithm.problem0209;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int count = kb.nextInt();
        int[][] numbers = new int[count][count];
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                numbers[i][j] = kb.nextInt();
            }
        }

        Main m = new Main();
        m.solution(count, numbers);
    }

    private void solution(int count, int[][] numbers) {
        int maxRowSum = 0;
        int maxLineSum = 0;
        int diagonalSum = 0;
        int reverseDiagonalSum = 0;

        for (int i = 0; i < count; i++) {
            int rowSum = 0;
            int lineSum = 0;

            for (int j = 0; j < count; j++) {
                rowSum = rowSum + numbers[i][j];
                lineSum = lineSum + numbers[j][i];
                if (i == j) {
                    diagonalSum = diagonalSum + numbers[i][j];
                }
                if (i + j == count - 1) {
                    reverseDiagonalSum = reverseDiagonalSum + numbers[i][j];
                }
            }
            if (rowSum > maxRowSum) {
                maxRowSum = rowSum;
            }
            if (lineSum > maxLineSum) {
                maxLineSum = lineSum;
            }
        }

        int maxSum = Math.max(Math.max(Math.max(maxLineSum, maxRowSum), diagonalSum), reverseDiagonalSum);

        System.out.println(maxSum);
    }
}
