import java.util.Scanner;

/**
 * TODO
 *
 * @author juwenting
 * @date 2017/10/17 上午10:54
 */
public class Taxi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), result=0;
        int[] s = new int[n];
        int[] temp = new int[4];
        for (int i=0; i<n; i++) {
            s[i] = scanner.nextInt();
            temp[s[i]-1] ++;
        }
        if (n == 1) {
            result = 1;
        } else {
            if (temp[2] <= temp[0]) {
                result = temp[3] + temp[2] + temp[1] / 2 +
                        (temp[1]%2==0 ? ((temp[0]-temp[2])/4 + (((temp[0]-temp[2])%4==0)?0:1)):((temp[0]+temp[1]-temp[2])/4 + (((temp[0]+temp[1]-temp[2])%4==0)?0:1)));
            } else {
                result = temp[3] + temp[2] + temp[1] / 2 + (temp[1]%2==0?0:1);
            }
        }
        System.out.println(result);
    }
}
