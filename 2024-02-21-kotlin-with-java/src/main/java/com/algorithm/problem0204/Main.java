package com.algorithm.problem0204;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int count = kb.nextInt();

        Main m = new Main();
        System.out.println(m.solution(count));
    }

    public String solution(int count) {
        int firstNumber = 0;
        int secondNumber = 1;
        StringBuilder answer = new StringBuilder();
        answer.append("1 ");
        for (int i = 1; i < count; i++) {
            int currentNumber = firstNumber + secondNumber;
            answer.append(currentNumber);
            firstNumber = secondNumber;
            secondNumber = currentNumber;
            answer.append(" ");
        }
        return answer.toString();
    }
}
