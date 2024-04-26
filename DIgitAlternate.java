import java.util.*;
public class DIgitAlternate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int l=(int)Math.log10(n);
       while(l>=0){
           int a=(int)(n/Math.pow(10,l))%10;
           System.out.print(a);
           l-=2;
       }
    }
}
