import java.util.*;
public class StringCharCountWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        for(int i=1;i<=s.length();i++){
            for(int j=0;j<=s.length()-i;j++){
                int k=j+i;
                String r=s.substring(j,k);
                System.out.println(r+"="+r.length());
            }
        }
    }
}
