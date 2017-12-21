import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 520B. Two Buttons
 *
 * @author juwenting
 * @date 2017/12/19 ÏÂÎç3:18
 */
public class TwoButtons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (n >= m) {
            System.out.println(n-m);
        } else {
            int redBlue = redBlue(n, m);
            int blueRed = blueRed(n, m);
            System.out.println(redBlue + blueRed);
        }
    }
    private static int redBlue(int n, int m) {
        int red = getRed(n, m).get("red");
        int blue = getRed(n, m).get("afterN") - m;
        return red+blue;
    }
    private static int blueRed(int n, int m) {
        int blue = 0, red = 0;
        for (int i = 0; i < n; i++) {
            if (m % (n-i) == 0) {
                blue = i;
                red = m / (n-i) - 1;
                return blue+red;
            }
        }
        return 10000;
    }

    private static Map<String, Integer> getRed(int n, int m) {
        Map<String, Integer> redMap = new HashMap<>();
        int red = 1;
        n = n * 2;
        while (n * 2 < m) {
            red ++;
            n = n * 2;
        }
        redMap.put("red", red);
        redMap.put("afterN", n);
        return redMap;
    }
}