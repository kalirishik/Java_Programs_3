import java.util.*;
public class StringWordPrintNextLetter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char c[]=s.toCharArray();
        for(int i=0;i<c.length;i++){
            int r=(int)c[i]+1;
            System.out.print((char)r);
        }
    }
}
