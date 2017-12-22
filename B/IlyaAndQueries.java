import java.util.Scanner;

/**
 * 313B. Ilya and Queries
 *
 * @author juwenting
 * @date 2017/12/21 обнГ5:09
 */
public class IlyaAndQueries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] chars = sc.next().toCharArray();
        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            int left = sc.nextInt();
            int right = sc.nextInt();

            int result = 0;
            for (int j = left-1; j < right - 1; j++) {
                if (chars[j] == chars[j+1]) {
                    result ++;
                }
            }
            System.out.println(result);
        }
    }
}
