import java.util.*;
public class SumOfDigitEqualtoOne {
    static boolean happy(int n){
        int sum=0;
        while(n>0){
            int r=n%10;
            sum+=r*r;
            n/=10;
        }
        if(sum==1)
            return true;
        else if(sum>=2 && sum<=9)
            return false;
        else
            return happy(sum);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(happy(n));
    }
}
