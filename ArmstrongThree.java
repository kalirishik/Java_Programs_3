import java.util.*;
public class ArmstrongThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int t=n;
        while(n!=0){
            int r=n%10;
            sum+=(int)Math.pow(r,3);
            n/=10;
        }
        System.out.println(t==sum?"Armstrong Number":"Not a Armstrong");

    }
}
