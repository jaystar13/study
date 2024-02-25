package problem7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(m.solution(str) ? "YES" : "NO");
    }

    private boolean solution(String str) {
        char[] charArray = str.toCharArray();
        int lt = 0;
        int rt = str.length() - 1;

        while (lt < rt) {
            if (Character.toLowerCase(charArray[lt]) != Character.toLowerCase(charArray[rt])) {
                return false;
            }

            lt++;
            rt--;
        }
        return true;
    }
}
