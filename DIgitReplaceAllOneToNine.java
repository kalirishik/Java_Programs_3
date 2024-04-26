import java.util.*;
public class DIgitReplaceAllOneToNine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l=(int)Math.log10(n);
        while(l!=-1){
           int r=(int)(n/Math.pow(10,l))%10;
            if(r==1)
                System.out.print(9);
            else
                System.out.print(r);
            l=l-1;
        }
    }
}
