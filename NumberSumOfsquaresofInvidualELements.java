import java.util.Scanner;

public class NumberSumOfsquaresofInvidualELements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l=(int)Math.log10(n);
        int sum=0;
        while(l!=-1){
            int r=(int)(n/Math.pow(10,l))%10;
            sum+=(int)Math.pow(r,2);
            l-=1;
        }
        System.out.println(sum);
    }
}
