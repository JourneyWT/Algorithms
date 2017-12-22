import java.util.Scanner;

/**
 * 734B. Anton and Digits
 *
 * @author juwenting
 * @date 2017/12/21 ÏÂÎç4:53
 */
public class AntonAndDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k2 = sc.nextInt(), k3 = sc.nextInt(), k5 = sc.nextInt(), k6 = sc.nextInt();

        // big = the num of 156
        int big = (k2 > k5) ? k5 : k2;
        big = (big > k6) ? k6 : big;

        // small = the num of 32
        int small = (k2-big > k3) ? k3 : k2-big;

        System.out.println(big * 256 + small * 32);

    }
}
