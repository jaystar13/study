package problem8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(m.solution(str) ? "YES" : "NO");
    }

    private boolean solution(String str) {
        char[] charArray = str.toCharArray();

        StringBuilder alphabetStr = new StringBuilder();
        for (char c : charArray) {
            if (Character.isAlphabetic(c)) {
                alphabetStr.append(c);
            }
        }
        StringBuilder reverse = new StringBuilder(alphabetStr).reverse();
        return alphabetStr.toString().equalsIgnoreCase(reverse.toString());

    }
}
