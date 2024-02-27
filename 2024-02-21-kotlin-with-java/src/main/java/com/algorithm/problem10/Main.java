package com.algorithm.problem10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String input = kb.nextLine();
        String[] split = input.split(" ");

        Main main = new Main();
        for (int distance : main.solution(split[0], split[1].charAt(0))) {
            System.out.print(distance + " ");
        }
    }

    public Integer[] solution(String str, char ch) {
        Integer[] distances = new Integer[str.length()];
        int position = str.length();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                position = 0;
            } else {
                position++;
            }
            distances[i] = position;
        }

        position = str.length();
        for (int i = str.length() - 1; i >= 0 ; i--) {
            if (str.charAt(i) == ch) {
                position = 0;
            } else {
                position++;
                position = Math.min(distances[i], position);
            }
            distances[i] = position;
        }

        return distances;
    }
}
