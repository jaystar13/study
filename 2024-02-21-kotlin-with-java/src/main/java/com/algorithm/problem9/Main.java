package com.algorithm.problem9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(solution(str));
    }

    public static int solution(String str) {
        String s = str.replaceAll("[^0-9]", "");

        return Integer.parseInt(s);
    }
}
