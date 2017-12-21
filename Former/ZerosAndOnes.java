import java.util.Scanner;

public class ZerosAndOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), temp = 0;
        sc.nextLine();
        String line = sc.nextLine();
        char[] input = line.toCharArray();
        for (int i = 0; i < input.length; i++) {
            if (input[i] == '0') {
                temp++;
            }
        }
        System.out.println(Math.abs(n - temp*2));
    }
}