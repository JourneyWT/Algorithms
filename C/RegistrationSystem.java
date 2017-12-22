import java.util.HashMap;
import java.util.Scanner;

public class RegistrationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String, Integer> names = new HashMap<>();
        String[] output = new String[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            if (!names.containsKey(name)) {
                names.put(name, 1);
                output[i] = "OK";
            } else {
                int temp = names.get(name);
                names.put(name, temp + 1);
                output[i] = name + temp;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(output[i]);
        }
    }
}