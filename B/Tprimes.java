import java.util.Arrays;
import java.util.Scanner;

/**
 * 230B. T-primes
 *
 * @author juwenting
 * @date 2017/12/19 ����12:42
 */
public class Tprimes {
    public static void main(String[] args) {

        int x, y;
        boolean[] primes = new boolean[1000001];
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;
        for (x = 2; x < 1000001; x++) {
            for (y = x * 2; y < 1000001; y += x) {
                primes[y] = false;
            }
        }

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Long temp = sc.nextLong();
            double sqrt = Math.sqrt((double)temp);

            // �ж�ƽ����double���� & ǿ��ת��int�ͺ��Ƿ���ȣ����жϻ�ȡ��ƽ�����Ƿ�������
            System.out.println(sqrt == (int)sqrt && primes[(int)sqrt] ? "YES" : "NO");
        }

    }

}
