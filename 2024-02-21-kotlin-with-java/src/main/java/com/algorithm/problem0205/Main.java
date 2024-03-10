package com.algorithm.problem0205;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        Main m = new Main();
        System.out.println(m.solution(n));
    }
    
    public int solution(int n) {
        int answer = 0;
        int[] numbers = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            if (numbers[i] == 0) {
                answer++;
            }
            for (int j = i; j <= n; j = j + i) {
                numbers[j] = 1;
            }
        }

        return answer;
    }
}
