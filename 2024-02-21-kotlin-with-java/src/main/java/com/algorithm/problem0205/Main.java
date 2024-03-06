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
        for (int i = 2; i <= n; i++) {
            if (i == 2) {
                answer++;
            } else if ( i % 2 > 0) {
                boolean flag = true;
                for (int j = 3; j < i; j = j + 2) {
                    if (i % j == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}
