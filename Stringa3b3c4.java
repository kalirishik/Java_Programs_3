import java.util.*;
public class Stringa3b3c4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c[] = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            String ch1 = "";
            String ch2 = "";
            int n = 0;
            while (i < c.length && c[i] >= 'a' && c[i] <= 'z') {
                ch1 += c[i++];
            }
            while (i < c.length && c[i] >= '0' && c[i] <= '9') {
                ch2 += c[i++];
            }
            n = Integer.parseInt(ch2);
            for (int j = 0; j < n; j++) {
                System.out.print(ch1);
            }
            i--;
        }
    }
}
