import java.util.Scanner;
public class StringCapitalREverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        StringBuffer sb = new StringBuffer(s);
        String sp[] = sb.reverse().toString().split(" ");
        String str[]=s.split(" ");
        for (int i = 0; i < sp.length; i++) {
            String r = "";
            char c[] = sp[i].toCharArray();
            char ch[] = str[i].toCharArray();
            int k = 0;
            for (int j = 0; j < c.length; j++) {
                if (c[j] >= 'a' && c[j] <= 'z')
                    r += c[j] + "";
            }
            r=r.substring(0,1).toUpperCase()+r.substring(1);
            for (int j = 0; j < c.length; j++) {
                if (ch[j] >= 'a' && ch[j] <= 'z')
                    System.out.print(r.charAt(k++));
                else
                    System.out.print(ch[j]);
            }
            System.out.print(" ");
        }
    }
}
