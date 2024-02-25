import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem4 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] strArr = new String[n];
        for (int i = 0; i < n; i++) {
            strArr[i] = kb.next();
        }

        for (String reverseString : solution(strArr)) {
            System.out.println(reverseString);
        }
    }

    public static List<String> solution(String[] strArr) {
        List<String> reverseStrings = new ArrayList<>();
        for (String str : strArr) {
            StringBuilder sb = new StringBuilder(str);
            reverseStrings.add(sb.reverse().toString());
        }

        return reverseStrings;
    }
}
