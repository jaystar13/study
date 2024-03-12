package com.algorithm.problem0211;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int count = kb.nextInt();
        int[][] arr = new int[count][5];
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = kb.nextInt();
            }
        }

        Main m = new Main();
        System.out.println(m.solution(count, arr));
    }

    public int solution(int count, int[][] arr) {

        int[] sameArr = new int[count];
        for (int i = 0; i < count; i++) {
            Set<Integer> same = new HashSet<>();
            for (int j = 0; j < 5; j++) {
                int temp = arr[i][j];
                for (int k = 0; k < count; k++) {
                    if (i != k && temp == arr[k][j]) {
                        same.add(k);
                    }
                }
            }
            sameArr[i] = same.size();
        }

        int answer = 1;
        int max = sameArr[0];
        for (int i = 1; i < sameArr.length; i++) {
            if (sameArr[i] > max) {
                max = sameArr[i];
                answer = i + 1;
            }
        }

        return answer;
    }
}
