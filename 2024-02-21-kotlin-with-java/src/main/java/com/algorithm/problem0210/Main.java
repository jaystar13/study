package com.algorithm.problem0210;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int count = kb.nextInt();
        int[][] arr = new int[count + 2][count + 2];
        for (int i = 1; i <= count; i++) {
            for (int j = 1; j <= count; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        Main m = new Main();
        System.out.println(m.solution(count, arr));
    }

    public int solution(int count, int[][] arr) {
        int answer = 0;
        for (int i = 1; i <= count; i++) {
            for (int j = 1; j <= count ; j++) {

                int temp = arr[i][j];

                if ((temp > arr[i - 1][j]) && (temp > arr[i][j - 1]) && (temp > arr[i][j + 1]) && (temp > arr[i + 1][j])) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
