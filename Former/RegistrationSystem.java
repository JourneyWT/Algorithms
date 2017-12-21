import java.util.Scanner;

public class RegistrationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), money = 0, k = 1;
        int[] a = new int[n];
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            p[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i+=k) {
            k = 1;
            while (i+k <= n-1 && p[i] <= p[i+k]) {
                k++;
            }
            for (int j = i; j < i+k; j++) {
                money += p[i] * a[j];
            }
        }
        System.out.print(money);
    }
}