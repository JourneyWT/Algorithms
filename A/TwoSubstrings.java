import java.util.Scanner;

/**
 * 550A. Two Substrings
 *
 * @author juwenting
 * @date 2017/12/18 обнГ7:33
 */
public class TwoSubstrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(isExistXY(input, 'A', 'B') || isExistXY(input, 'B', 'A') ? "YES" : "NO");

    }

    private static boolean isExistXY(String s, char x, char y) {
        char[] chars = s.toCharArray();
        int temp = 0;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == y && chars[i-1] == x) {
                chars[i] = '0';
                chars[i-1] = '0';
                temp = i;
                break;
            }
        }
        if (temp != 0) {
            for (int j = 1; j < chars.length; j++) {
                if (chars[j] == x && chars[j-1] == y) {
                    return true;
                }
            }
        }

        return false;
    }

}
