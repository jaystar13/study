package problem5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.println(solution(str));
    }

    public static String solution(String str) {
        char[] charArray = str.toCharArray();

        int lt = 0;
        int rt = str.length() - 1;

        while (lt < rt) {
            if (!Character.isAlphabetic(charArray[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(charArray[rt])) {
                rt--;
            } else {
                char tmp = charArray[lt];
                charArray[lt] = charArray[rt];
                charArray[rt] = tmp;

                lt++;
                rt--;
            }
        }

        return String.valueOf(charArray);
    }
}
