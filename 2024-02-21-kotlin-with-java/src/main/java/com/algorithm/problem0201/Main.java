package com.algorithm.problem0201;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String count = kb.nextLine();
        String str = kb.nextLine();
        Main m = new Main();
        String[] split = str.split(" ");
        int[] nums = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            nums[i] = Integer.parseInt(split[i]);
        }

        for (int num : m.solution(Integer.parseInt(count), nums)) {
            System.out.print(num + " ");
        }

    }

    public List<Integer> solution(int count, int[] nums) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            if (i == 0 || (nums[i] > nums[i - 1])) {
                answer.add(nums[i]);
            }
        }

        return answer;
    }
}
