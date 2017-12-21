import java.util.Scanner;

/**
 * 706B. Interesting drink
 *
 * @author juwenting
 * @date 2017/12/19 ÏÂÎç2:08
 */
public class InterestingDrink {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    // 1 ~ 100000
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        sort(prices);

        int q = sc.nextInt();    // 1 ~ 100000
        for (int j = 0; j < q; j++) {
            int coin = sc.nextInt();
            if (coin < prices[0]) {
                System.out.println(0);
            } else if (coin >= prices[n-1]) {
                System.out.println(n);
            } else {
                System.out.println(binarySearch(prices, coin)+1);
            }
        }
    }

    private static int binarySearch(int[] prices, int coin) {
        int start = 0, end = prices.length-1;

        while (start < end - 1) {
            int middle = (start + end) / 2;
            if (coin > prices[middle]) {
                start = middle;
            } else if (coin < prices[middle]) {
                end = middle;
            } else if (coin == prices[middle]){
                return middle;
            }
        }
        if (start == end -1) {
            return start;
        }
        return -1;
    }

    private static void sort(int[] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = i; j < x.length; j++) {
                if (x[i] > x[j]) {
                    int temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }
    }
}
