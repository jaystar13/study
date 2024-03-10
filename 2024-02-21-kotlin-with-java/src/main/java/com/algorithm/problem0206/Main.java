package com.algorithm.problem0206;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int cnt = kb.nextInt();
        int[] nums = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            String temp = kb.next();
            StringBuilder reverse = new StringBuilder();
            for (int j = temp.length() - 1; j >= 0; j--) {
                reverse.append(temp.charAt(j));
            }
            nums[i] = Integer.parseInt(reverse.toString());
        }
        Main m = new Main();
        for (Integer num : m.solution(nums)) {
            System.out.print(num + " ");
        }
    }

    public List<Integer> solution(int[] nums) {
        List<Integer> answer = new ArrayList<>();

        for (int num : nums) {
            if (isPrime(num)) {
                answer.add(num);
            }
        }

        return answer;
    }

    public boolean isPrime(int num) {
        if (num == 1) return false;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }
}
