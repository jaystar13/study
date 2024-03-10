package com.algorithm.problem0208;

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
        for (int grade : m.solution(count, nums)) {
            System.out.print(grade + " ");
        }
    }

    public int[] solution(int count, int[] nums) {

        int[] gradeList = new int[count];

        for (int i = 0; i < count; i++) {
            int grade = 1;
            for (int j = 0; j < count; j++) {
                if (i != j && nums[i] < nums[j]) {
                    grade++;
                }
            }

            gradeList[i] = grade;
        }

        return gradeList;
    }

}
