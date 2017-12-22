import java.util.Scanner;

/**
 * 149A. Business trip
 *
 * @author juwenting
 * @date 2017/12/21 ÏÂÎç2:09
 */
public class BusinessTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] month = new int[13];
        for (int i = 0; i < 12; i++) {
            month[i] = sc.nextInt();
        }
        month[12] = 0;
        sort(month);
        int num = 0, sum = 0;
        while (sum < k && num <= 12) {
            sum += month[num];
            num ++;
        }
        System.out.println(num == 13 ? -1 : num);

    }
    private static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
