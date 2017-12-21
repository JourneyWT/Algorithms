import java.util.Scanner;

public class Ilya {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        if (n >= 10) {
            System.out.println(n);
        } else if (n % 10 == 0 && (n / 10) >= -9 && (n / 10) <= -1) {
            System.out.print("0");
        } else {
            String nString = String.valueOf(n);
            char[] nChars = nString.toCharArray();
            if (n % 10 < (n/10) % 10) {
                for (int i = 0; i < nChars.length-1; i++) {
                    System.out.print(nChars[i]);
                }
            } else {
                for (int i = 0; i < nChars.length-2; i++) {
                    System.out.print(nChars[i]);
                }
                System.out.print(nChars[nChars.length-1]);
            }
        }
    }
}
