package problem6;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(m.solution(str));
    }

    public String solution(String str) {
        Set<Character> charSet = new LinkedHashSet<>();
        char[] charArray = str.toCharArray();

        for (char x : charArray) {
            charSet.add(x);
        }

        StringBuilder answer = new StringBuilder();
        for (Character c : charSet) {
            answer.append(c);
        }

        return answer.toString();
    }
}
