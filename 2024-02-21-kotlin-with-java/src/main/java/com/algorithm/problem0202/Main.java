package com.algorithm.problem0202;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int count = Integer.parseInt(kb.nextLine());
        int[] heights = new int[count];
        for (int i = 0; i < count; i++) {
            heights[i] = kb.nextInt();
        }

        Main m = new Main();
        System.out.println(m.solution(heights));
    }

    public int solution(int[] heights) {
        int answer = 1;
        int maxHeight = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                answer++;
                maxHeight = heights[i];
            }
        }
        return answer;
    }
}
