import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int t=n;
        int l=(int)Math.log10(n)+1;
        while(n!=0){
            int r=n%10;
            sum+=(int)Math.pow(r,l);
            n/=10;
        }
        System.out.println(t==sum?"Armstrong Number":"Not a Armstrong");

    }
}
