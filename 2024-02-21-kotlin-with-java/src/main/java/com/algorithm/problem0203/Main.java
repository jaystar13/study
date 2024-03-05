package com.algorithm.problem0203;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int count = kb.nextInt();

        int[] firstArr = new int[count];
        for (int i = 0; i < count; i++) {
            firstArr[i] = kb.nextInt();
        }

        int[] secondArr = new int[count];
        for (int i = 0; i < count; i++) {
            secondArr[i] = kb.nextInt();
        }

        Main m = new Main();
        List<String> solution = m.solution(count, firstArr, secondArr);
        for (String s : solution) {
            System.out.println(s);
        }
    }

    public List<String> solution(int count, int[] first, int[] second) {
        List<String> answer = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            if (first[i] == second[i]) {
                answer.add("D");
            } else if ((first[i] == 1 && second[i] == 3) ||
                    (first[i] == 2 && second[i] == 1) ||
                    (first[i] == 3 && second[i] == 2)) {
                answer.add("A");
            } else {
                answer.add("B");
            }
        }

        return answer;
    }
}
