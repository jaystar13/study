package com.algorithm.problem12;

import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String digit = kb.nextLine();
        String str = kb.nextLine();
        Main main = new Main();
        System.out.println(main.solution(Integer.parseInt(digit), str));
    }

    public String solution(int digit, String str) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < digit; i++) {
            String temp = str.substring(i * 7, i * 7 + 7);
            temp = temp.replace("#", "1").replace("*", "0");
            answer.append((char) Integer.parseInt(temp, 2));
        }
        return answer.toString();
    }
}
