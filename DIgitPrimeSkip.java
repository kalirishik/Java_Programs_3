import java.util.*;
public class DIgitPrimeSkip {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int c;
        for(int i=0;i<s.length();i++){
            String sp=s.charAt(i)+"";
            int n=Integer.parseInt(sp);
            c=0;
            for(int j=1;j<=n;j++){
                if(n%j==0)
                    c++;
            }
            if(c==2){
                if(n%2==0)
                    continue;
                else
                    System.out.println(n);
            }
        }
    }
}
