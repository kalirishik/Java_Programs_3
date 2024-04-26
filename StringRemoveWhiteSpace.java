import java.util.*;
public class StringRemoveWhiteSpace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(s.trim());
        char c[]=s.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]>=65 && c[i]<=90 || c[i]>=97 && c[i]<=122)
                System.out.print(c[i]);
        }
    }
}
