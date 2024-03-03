package com.algorithm.problem11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        Main m = new Main();
        System.out.println(m.solution(str));
    }

    public String solution(String str) {
        StringBuilder answer = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            if ((i != str.length() - 1) && (str.charAt(i) == str.charAt(i + 1))) {
                int repeatCount = 2;
                for (int j = i + 2; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        repeatCount++;
                    } else {
                        break;
                    }
                }
                answer.append(str.charAt(i)).append(repeatCount);
                i = i + repeatCount;
            } else {
                answer.append(str.charAt(i));
                i++;
            }
        }

        return answer.toString();
    }
}
