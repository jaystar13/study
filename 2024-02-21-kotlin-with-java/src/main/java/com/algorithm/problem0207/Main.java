package com.algorithm.problem0207;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int count = kb.nextInt();
        int[] nums = new int[count];
        for (int i = 0; i < count; i++) {
            nums[i] = kb.nextInt();
        }

        Main m = new Main();
        System.out.println(m.solution(nums));
    }

    public int solution(int[] nums) {
        int answer = 0;
        int point = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                point++;
            } else {
                point = 0;
            }
            answer = answer + point;
        }

        return answer;
    }
}
