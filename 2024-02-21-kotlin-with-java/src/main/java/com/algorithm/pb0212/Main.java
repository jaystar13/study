package com.algorithm.pb0212;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int studentCount = kb.nextInt();
        int examCount = kb.nextInt();
        int[][] arr = new int[examCount][studentCount];

        for (int i = 0; i < examCount; i++) {
            for (int j = 0; j < studentCount; j++) {
                arr[i][j] = kb.nextInt();
            }
        }

        Main m = new Main();
        System.out.println(m.solution(examCount, studentCount, arr));
    }

    public int solution(int examCount, int studentCount, int[][] arr) {
        int answer = 0;
        int[][] arr2 = new int[examCount][studentCount];

        for (int i = 0; i < examCount; i++) {
            for (int j = 0; j < studentCount; j++) {
                for (int k = 0; k < studentCount; k++) {
                    if (j + 1 == arr[i][k]) {
                        arr2[i][j] = k + 1;
                    }
                }
            }
        }

        for (int i = 0; i < studentCount - 1; i++) {
            for (int j = i + 1; j < studentCount; j++) {
                boolean temp = arr2[0][i] < arr2[0][j];
                boolean isPair = true;
                for (int k = 1; k < examCount; k++) {
                    if (temp != arr2[k][i] < arr2[k][j]) {
                        isPair = false;
                        break;
                    }
                }
                if (isPair) {
                    answer++;
                }
            }

        }

        return answer;
    }
}
